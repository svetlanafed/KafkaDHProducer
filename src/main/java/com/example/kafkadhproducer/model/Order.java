package com.example.kafkadhproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String productName;
    private String code;
    private int quantity;
    private double price;
}
