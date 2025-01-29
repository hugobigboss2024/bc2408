package com.example.demoyahoo1.model;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demoyahoo1.exception.ErrorCode;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@RestController
public class StockQuote {
    private List<Result> result;
    private ErrorCode error;
}
