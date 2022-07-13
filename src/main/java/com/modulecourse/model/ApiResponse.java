package com.modulecourse.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    Boolean status;
    Integer code;
    String message;
    T bodyApi;

    public ApiResponse(T body) {
            this.bodyApi = bodyApi;
        }
}
