package com.caglardurmaz.readingisgood.model;

import lombok.Data;

@Data
public class LoginResponse extends ResultResponse{
    private String sessionId;
}
