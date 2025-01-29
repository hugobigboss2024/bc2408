package com.example.demoyahoo1.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import com.example.demoyahoo1.infra.CookieManager;

@Service
public class CrumbService {

    private HttpClient client;
    private CookieManager cookieManager;

    public CrumbService() {
        this.client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        this.cookieManager = new CookieManager();
    }

    public String getCrumb(String symbol) throws IOException, InterruptedException {
        // 獲取 cookies（假設 cookieManager 已經定義並初始化）
        String cookies = cookieManager.getResponse();
        // System.out.println("cookies : " + cookies);

        // 獲取 crumb
        String crumbUrl = "https://query1.finance.yahoo.com/v1/test/getcrumb";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(crumbUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // 在請求中傳遞 cookies
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        // crumb 通常在回應體中
        String crumb = httpResponse.body();
        String uriCrumb = httpResponse.uri().toString();

        // System.out.println("Crumb: " + crumb);

        // 使用 crumb 和 symbol 進行請求
        String quoteUrl = String.format("https://query1.finance.yahoo.com/v7/finance/quote?symbols=%s&crumb=%s", symbol,
                crumb);

        request = HttpRequest.newBuilder()
                .uri(URI.create(quoteUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // 在請求中傳遞 cookies
                .GET()
                .build();

        httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();
        // System.out.println("body = " + body);

        return crumb;
    }

    public String getBody(String symbol) throws IOException, InterruptedException {
        // 獲取 cookies（假設 cookieManager 已經定義並初始化）
        String cookies = cookieManager.getResponse();
        // System.out.println("cookies : " + cookies);

        // 獲取 crumb
        String crumbUrl = "https://query1.finance.yahoo.com/v1/test/getcrumb";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(crumbUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // 在請求中傳遞 cookies
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        // crumb 通常在回應體中
        String crumb = httpResponse.body();
        System.out.println("Crumb: " + crumb);

        // 使用 crumb 和 symbol 進行請求
        String quoteUrl = String.format("https://query1.finance.yahoo.com/v7/finance/quote?symbols=%s&crumb=%s", symbol,
                crumb);

        request = HttpRequest.newBuilder()
                .uri(URI.create(quoteUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies) // 在請求中傳遞 cookies
                .GET()
                .build();

        httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();

        // System.out.println("body = " + body);

        return body;
    }

    public static void main(String[] args) {
        CrumbService crumbService = new CrumbService();
        try {
            String body0010 = crumbService.getBody("0010.HK");
            System.out.println("stock body: " + body0010);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error retrieving crumb: " + e.getMessage());
        }
    }
}