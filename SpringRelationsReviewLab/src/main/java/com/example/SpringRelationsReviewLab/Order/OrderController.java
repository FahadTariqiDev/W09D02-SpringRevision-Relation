package com.example.SpringRelationsReviewLab.Order;

import com.example.SpringRelationsReviewLab.Order.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("")
    public ResponseEntity getCategory() {
        return ResponseEntity.ok(orderService.getAllOrder());
    }

    @GetMapping("{id}")
    public Order getCategoryById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping
    public void deleteCategoryById(@PathVariable String id) {
        orderService.deleteOrderById(id);
    }

    @PostMapping
    public Order addCategory(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
