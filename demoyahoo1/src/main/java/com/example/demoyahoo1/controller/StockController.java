package com.example.demoyahoo1.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoyahoo1.model.Result;
import com.example.demoyahoo1.model.StockQuote;
import com.example.demoyahoo1.service.CrumbService;
import com.example.demoyahoo1.service.StocksService;

@RestController
public class StockController {
    @Autowired
    private final StocksService stocksService;
    @Autowired
    private final CrumbService crumbService;

    public StockController(StocksService stocksService, CrumbService crumbService) {
        this.stocksService = stocksService;
        this.crumbService = crumbService;
    }

    @GetMapping("/stock/{symbol}")
    public List<StockQuote> getStockQuote(@PathVariable String symbol) {
        // 假設你已經獲取了 crumb 值
        try {
            // 獲取 crumb 值
            String crumb = crumbService.getCrumb(symbol);
            // 使用 crumb 和 symbol 來獲取股票報價
            // return stocksService.getStockQuote(symbol, crumb);
            return null;
        } catch (IOException | InterruptedException e) {
            // 處理異常，例如打印日誌或返回 null
            System.err.println("Error retrieving stock quote: " + e.getMessage());
            return null;
        }
    }

    @GetMapping("/stock/{symbol}/body")
    public String getStockBody(@PathVariable String symbol) {
        // 假設你已經獲取了 crumb 值
        try {
            // 獲取 crumb 值
            // 使用 crumb 和 symbol 來獲取股票報價
            Result result = stocksService.getStockQuote(symbol);
            return result.toString();
        } catch (IOException | InterruptedException e) {
            // 處理異常，例如打印日誌或返回 null
            System.err.println("Error retrieving stock quote: " + e.getMessage());
            return null;
        }
    }
}
