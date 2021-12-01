package com.example.SpringRelationsReviewLab.Order;

import com.example.SpringRelationsReviewLab.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    public Order getOrderById(String id) {
        Long Order_id = Long.parseLong(id);
        return orderRepo.findById(Order_id).orElse(null);
    }

    public void deleteOrderById(String id) {
        Long Order_id = Long.parseLong(id);
        orderRepo.deleteById(Order_id);
    }

    public Order addOrder(Order order) {
        return orderRepo.save(order);
    }
}
