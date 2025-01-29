package com.example.demo_yahoo;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

@Service
public class YahooFinanceService {

    public String getStockData(String stockSymbol) {
        try {
            // 构建 URL
            String url = "https://finance.yahoo.com/quote/" + stockSymbol;
            // 使用 Jsoup 连接并获取文档
            Document document = Jsoup.connect(url).get();

            // 创建 JSON 对象
            JSONObject stockData = new JSONObject();

            // 抓取所需的数据
            Element nameElement = document.selectFirst("h1[data-reactid='7']");
            Element priceElement = document.selectFirst("fin-streamer[data-field='regularMarketPrice']");
            Element changeElement = document.selectFirst("fin-streamer[data-field='regularMarketChange']");
            Element percentChangeElement = document
                    .selectFirst("fin-streamer[data-field='regularMarketChangePercent']");

            // 将抓取的数据放入 JSON 对象
            stockData.put("symbol", stockSymbol);
            stockData.put("name", nameElement != null ? nameElement.text() : "未找到");
            stockData.put("price", priceElement != null ? priceElement.text() : "价格未找到");
            stockData.put("change", changeElement != null ? changeElement.text() : "变动未找到");
            stockData.put("percentChange", percentChangeElement != null ? percentChangeElement.text() : "百分比变动未找到");

            return stockData.toString(); // 返回 JSON 格式的字符串
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"error\": \"抓取失败\"}"; // 返回错误信息
        }
    }
}