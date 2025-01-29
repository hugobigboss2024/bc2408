package com.example.demoyahoo1.service;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper; // 导入 Jackson 的 ObjectMapper

import main.java.com.example.demoyahoo1.infra.CookieManager;
import main.java.com.example.demoyahoo1.model.Result;

@Service
public class CrumbService {

    private CookieManager cookieManager;
    private ObjectMapper objectMapper; // 添加 ObjectMapper

    public CrumbService() {
        this.cookieManager = new CookieManager();
        this.objectMapper = new ObjectMapper(); // 初始化 ObjectMapper
    }

    public Result getCrumb() throws IOException, InterruptedException {
        // 获取 cookies
        String cookies = cookieManager.getResponse();
        System.out.println("cookies : " + cookies);

        // 获取 crumb
        String crumbUrl = "https://query1.finance.yahoo.com/v1/test/getcrumb";

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .proxy(ProxySelector.of(new InetSocketAddress("127.0.0.1", 10809)))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(crumbUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies)
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 解析响应体为 Result 对象
        Result result = objectMapper.readValue(httpResponse.body(), Result.class);
        System.out.println("Result: " + result);

        // 使用 crumb 和其他信息进行请求
        String quoteUrl = String.format("https://query1.finance.yahoo.com/v7/finance/quote?symbols=0388.HK&crumb=%s",
                result.getCrumb()); // 假设 Result 类有 getCrumb 方法
        request = HttpRequest.newBuilder()
                .uri(URI.create(quoteUrl))
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "*/*")
                .header("Cookie", cookies)
                .GET()
                .build();

        httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();
        System.out.println("body = " + body);

        // 解析响应体为 Result 对象
        Result quoteResult = objectMapper.readValue(body, Result.class);

        return quoteResult; // 返回 Result 对象
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

        return body;
    }

    public static void main(String[] args) {
        CrumbService crumbService = new CrumbService();
        /*
         * try {
         * String body0010 = crumbService.getBody("0010.HK");
         * System.out.println("stock body: " + body0010);
         * } catch (IOException | InterruptedException e) {
         * e.printStackTrace();
         * System.out.println("Error retrieving crumb: " + e.getMessage());
         * }
         */
        com.example.demoyahoo1.model.Result result = crumbService.getCrumb();
        // System.out.println("Result: " + result.getQuoteType());
        System.out.println("Result: " + result.getSymbol());
    }
}