package com.modulecourse.controller;

import com.modulecourse.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseController {
    protected ResponseEntity sendSuccesResponse(Object bodyApi){       /////////////
        return new ResponseEntity(new ApiResponse<>(Boolean.TRUE, 200, "Successful", bodyApi), HttpStatus.OK);
    }
}
