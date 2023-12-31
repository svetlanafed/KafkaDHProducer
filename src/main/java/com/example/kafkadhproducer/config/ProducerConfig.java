package com.example.kafkadhproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerConfig {

    @Value("${topic.send-order}")
    private String topicName;

    @Value("${topic.send-order-two}")
    private String secondTopicName;

    @Bean
    public NewTopic topicWithPartitions() {
        return TopicBuilder.name(topicName)
                .partitions(2)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topicWithoutPartitions() {
        return TopicBuilder.name(secondTopicName)
                .replicas(1)
                .build();
    }
}
