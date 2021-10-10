package com.caglardurmaz.readingisgood.handlers;

import com.caglardurmaz.readingisgood.domain.Customer;
import com.caglardurmaz.readingisgood.domain.SessionEngine;
import com.caglardurmaz.readingisgood.model.LoginResponse;
import com.caglardurmaz.readingisgood.model.RegisterRequest;
import com.caglardurmaz.readingisgood.model.ResultResponse;
import com.caglardurmaz.readingisgood.model.UserSession;
import com.caglardurmaz.readingisgood.repositories.CustomerRepository;
import com.caglardurmaz.readingisgood.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Component
public class CustomerHandler {

    private final CustomerRepository customerRepository;

    public CustomerHandler(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public ResultResponse registerCustomer(RegisterRequest registerRequest){
        Customer customer = new Customer();
        customer.setName(registerRequest.getName());
        customer.setUserName(registerRequest.getUserName());
        customer.setPassword(registerRequest.getPassword());
        log.info("Saving customer: {}", customer);
        customerRepository.save(customer);
        return CommonUtils.generateSuccessResponse();
    }


    public LoginResponse createSession(String userName, String password){
        log.info("checking user info");
        Customer customer = customerRepository.getUserName(userName, password).get(0);
        UserSession session = new UserSession();
        session.setSessionId(UUID.randomUUID().toString());
        session.setCustomer(customer);
        SessionEngine.getInstance().setSessionStorageStorage(session);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setSessionId(session.getSessionId());
        ResultResponse response = CommonUtils.generateSuccessResponse();
        loginResponse.setResponseCode(response.getResponseCode());
        loginResponse.setResponseMessage(response.getResponseMessage());
        loginResponse.setResponseStatus(response.getResponseStatus());
        return loginResponse;
    }
}
