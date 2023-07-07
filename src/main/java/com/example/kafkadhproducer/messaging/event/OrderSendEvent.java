package com.example.kafkadhproducer.messaging.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Jacksonized
public class OrderSendEvent {

    private String productName;
    private String code;
    private int quantity;
    private double price;
}
