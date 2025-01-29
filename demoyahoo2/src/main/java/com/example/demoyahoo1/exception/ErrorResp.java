package com.example.demoyahoo1.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ErrorResp {
  private Integer code;
  private String message;
}
