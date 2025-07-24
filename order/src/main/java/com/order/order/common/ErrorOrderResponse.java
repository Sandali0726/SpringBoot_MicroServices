package com.order.order.common;

public class ErrorOrderResponse extends OrderResponse {
    
    public ErrorOrderResponse(String errorMessage) {
        super(false, errorMessage);
    }
}
