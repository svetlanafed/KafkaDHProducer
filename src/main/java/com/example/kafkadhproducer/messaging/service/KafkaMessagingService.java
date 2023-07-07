package com.example.kafkadhproducer.messaging.service;

import com.example.kafkadhproducer.messaging.event.OrderSendEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

    @Value("${topic.send-order}")
    private String sendClientTopic;

    @Value("${topic.send-order-two}")
    private String secondSendClientTopic;

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendOrder(OrderSendEvent orderSendEvent) {
        kafkaTemplate.send(sendClientTopic, orderSendEvent.getCode(), orderSendEvent);
        kafkaTemplate.send(secondSendClientTopic, orderSendEvent.getCode(), orderSendEvent);
    }
}
