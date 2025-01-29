package com.example.demoyahoo1.infra;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrumbManager {

    @Autowired
    private CookieManager cookieManager;

    public String getCrumb() throws IOException, InterruptedException {
        // Get cookies first
        String cookies = cookieManager.getResponse();
        System.out.println("cookies : " + cookies);

        // Now make a request to get the crumb
        String crumbUrl = "https://query1.finance.yahoo.com/v1/test/getcrumb";

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .proxy(ProxySelector.of(new InetSocketAddress("127.0.0.1", 10809)))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(crumbUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // Pass cookies in the request
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        // The crumb is typically in the body of the response
        String crumb = httpResponse.body();
        System.out.println("Crumb: " + crumb);

        request = HttpRequest.newBuilder()
                .uri(URI.create(String
                        .format("https://query1.finance.yahoo.com/v7/finance/quote?symbols=0388.HK&crumb=%s", crumb)))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // Pass cookies in the request
                .GET()
                .build();

        httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();
        // System.out.println("body = " + body);

        return crumb;
    }

}
