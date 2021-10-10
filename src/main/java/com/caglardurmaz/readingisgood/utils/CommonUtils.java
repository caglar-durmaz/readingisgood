package com.caglardurmaz.readingisgood.utils;

import com.caglardurmaz.readingisgood.CommonConstants;
import com.caglardurmaz.readingisgood.model.ResultResponse;

public interface CommonUtils {

    static ResultResponse generateSuccessResponse() {
        ResultResponse response = new ResultResponse();
        response.setResponseCode(CommonConstants.SUCCESS);
        response.setResponseMessage(CommonConstants.SUCCESS_MSG);
        response.setResponseStatus("SUCCESS");
        return response;
    }

    static ResultResponse generateFailResponse(String errorCode, String errorMsg){
        ResultResponse response = new ResultResponse();
        response.setResponseCode(errorCode);
        response.setResponseMessage(errorMsg);
        response.setResponseStatus("ERROR");
        return response;
    }

}
