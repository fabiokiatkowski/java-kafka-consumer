package com.elemental.apiservicebjava.handler;

import com.elemental.apiservicebjava.dto.OrderDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderHandler {
    @KafkaListener(topics = "local_order_topic", groupId = "group_id")
    public void handler(String message) {
        OrderDTO orderDTO;
        try {
            orderDTO = new ObjectMapper().readValue(message, OrderDTO.class);
            log.info(orderDTO.getExternalId());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
