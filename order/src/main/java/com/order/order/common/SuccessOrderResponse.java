package com.order.order.common;

import com.order.order.dto.OrderDTO;

public class SuccessOrderResponse extends OrderResponse {
    private OrderDTO orderDTO;

    public SuccessOrderResponse(OrderDTO orderDTO) {
        super(true, "Order processed successfully");
        this.orderDTO = orderDTO;
    }

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }
}
