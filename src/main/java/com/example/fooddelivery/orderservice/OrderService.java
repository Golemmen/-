package com.example.fooddelivery.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public Order createOrder(Order order) {
        order.setStatus("Pending");
        Order savedOrder = orderRepository.save(order);
        kafkaTemplate.send("new-order", savedOrder.getId());
        return savedOrder;
    }

    public Order getOrder(String id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }
}



