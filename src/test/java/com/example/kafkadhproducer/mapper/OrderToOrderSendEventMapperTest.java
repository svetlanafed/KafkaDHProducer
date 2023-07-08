package com.example.kafkadhproducer.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.kafkadhproducer.messaging.event.OrderSendEvent;
import com.example.kafkadhproducer.model.Order;
import org.junit.jupiter.api.Test;

class OrderToOrderSendEventMapperTest {

    private final OrderToOrderSendEventMapper orderSendEventMapper = new OrderToOrderSendEventMapper();

    @Test
    void mapShouldReturnOrderSendEvent() {
        Order givenOrder = Order.builder()
                .productName("kefir")
                .code("12")
                .quantity(10)
                .price(12.3)
                .build();

        OrderSendEvent expectedOrderSendEvent = OrderSendEvent.builder()
                .productName("kefir")
                .code("12")
                .quantity(10)
                .price(12.3)
                .build();

        OrderSendEvent actualOrderSendEvent = orderSendEventMapper.map(givenOrder);

        assertEquals(expectedOrderSendEvent, actualOrderSendEvent);
    }
}