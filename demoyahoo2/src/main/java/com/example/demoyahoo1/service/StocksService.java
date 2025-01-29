package com.example.demoyahoo1.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import com.example.demoyahoo1.infra.CookieManager;
import com.example.demoyahoo1.model.Result;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StocksService {
    private HttpClient client;
    private CookieManager cookieManager;
    private ObjectMapper objectMapper; // 添加 ObjectMapper

    public StocksService() {
        this.client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        this.cookieManager = new CookieManager();
        this.objectMapper = new ObjectMapper(); // 初始化 ObjectMapper
    }

    public Result getStockQuote(String symbol) throws IOException, InterruptedException {
        // 获取 cookies
        String cookies = cookieManager.getResponse();

        // 获取 crumb
        String crumbUrl = "https://query1.finance.yahoo.com/v1/test/getcrumb";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(crumbUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies)
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String crumb = httpResponse.body();

        // 使用 crumb 和 symbol 进行请求
        String quoteUrl = String.format("https://query1.finance.yahoo.com/v7/finance/quote?symbols=%s&crumb=%s", symbol,
                crumb);
        request = HttpRequest.newBuilder()
                .uri(URI.create(quoteUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies)
                .GET()
                .build();

        httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();

        // 将 JSON 字符串转换为 Result 对象
        Result result = objectMapper.readValue(body, Result.class);
        /*
         * System.out.println("Ask Size: " + result.getAskSize());
         * System.out.println("Bid Size: " + result.getBidSize());
         * System.out.println("Average Analyst Rating: " +
         * result.getAverageAnalystRating());
         * System.out.println("Currency: " + result.getCurrency());
         */

        return result;
    }

}
