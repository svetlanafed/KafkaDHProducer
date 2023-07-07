package com.example.kafkadhproducer.messaging.producer;

import com.example.kafkadhproducer.mapper.OrderToOrderSendEventMapper;
import com.example.kafkadhproducer.messaging.service.KafkaMessagingService;
import com.example.kafkadhproducer.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaMessagingService kafkaMessagingService;
    private final OrderToOrderSendEventMapper orderSendEventMapper;


    public Order sendOrderEvent(Order order) {
        kafkaMessagingService.sendOrder(orderSendEventMapper.map(order));
        log.info("Send order from producer {}", order);
        return order;
    }
}