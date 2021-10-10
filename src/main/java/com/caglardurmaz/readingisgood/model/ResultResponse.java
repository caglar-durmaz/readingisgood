package com.caglardurmaz.readingisgood.model;

import lombok.Data;

@Data
public class ResultResponse {
    String responseCode;
    String responseMessage;
    String responseStatus;;
}