package com.example.demo_yahoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private YahooFinanceService yahooFinanceService;

    @GetMapping("/stock/{symbol}")
    public String getStockData(@PathVariable String symbol) {
        return yahooFinanceService.getStockData(symbol);
    }
}
