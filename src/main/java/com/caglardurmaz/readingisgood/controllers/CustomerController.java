package com.caglardurmaz.readingisgood.controllers;

import com.caglardurmaz.readingisgood.handlers.CustomerHandler;
import com.caglardurmaz.readingisgood.model.LoginResponse;
import com.caglardurmaz.readingisgood.model.RegisterRequest;
import com.caglardurmaz.readingisgood.model.ResultResponse;
import com.caglardurmaz.readingisgood.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerHandler customerHandler;

    @RequestMapping("/register")
    public ResponseEntity<ResultResponse> register(@RequestBody RegisterRequest registerRequest) {
        log.info("register request: {}", registerRequest);
        return ResponseEntity.ok(customerHandler.registerCustomer(registerRequest));
    }

    @RequestMapping("/createSession")
    public ResponseEntity<LoginResponse> createSession(@RequestParam String userName, @RequestParam String password) {
        log.info("register userName: {}, password: {}", userName, password);
        return ResponseEntity.ok(customerHandler.createSession(userName, password));
    }
}
