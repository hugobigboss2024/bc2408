package com.example.demoyahoo1.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demoyahoo1.infra.CookieManager;

@Service
public class Crumb {

    @Autowired
    private RestTemplate restTemplate;
    private HttpClient client;

    @Autowired
    private CookieManager cookieManager;

    public Crumb() {

    }

    public String getNewUrl(String symbol) {
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
        return crumb;

        // 使用 crumb 和 symbol 進行請求
        /*
         * String quoteUrl = String.format(
         * "https://query1.finance.yahoo.com/v7/finance/quote?symbols=%s&crumb=%s",
         * symbol,
         * crumb);
         * return quoteUrl;
         */
    }

    public static void main(String[] args) {
        Crumb crumb = new Crumb();
        String crumbUrl = crumb.getNewUrl("0001.HK");

        String symbol = "0001.HK";

        String url = "https://query1.finance.yahoo.com/v7/finance/quote?symbols=%s&crumb=%s" + symbol
                + crumbUrl;
        System.out.println(url);

    }

}