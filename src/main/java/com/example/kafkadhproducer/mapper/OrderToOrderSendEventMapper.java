package com.example.kafkadhproducer.mapper;

import com.example.kafkadhproducer.messaging.event.OrderSendEvent;
import com.example.kafkadhproducer.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderSendEventMapper {

    public OrderSendEvent map(Order order) {
        return OrderSendEvent.builder()
                .productName(order.getProductName())
                .code(order.getCode())
                .quantity(order.getQuantity())
                .price(order.getPrice())
                .build();
    }
}
