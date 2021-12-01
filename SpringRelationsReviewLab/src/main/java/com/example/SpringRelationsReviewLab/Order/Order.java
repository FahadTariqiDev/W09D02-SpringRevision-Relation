package com.example.SpringRelationsReviewLab.Order;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private double orderPrice;
//    private Date orderDate;

    public Order(Long orderId, double orderPrice) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
//        this.orderDate = orderDate;
    }

    public Order() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
}
