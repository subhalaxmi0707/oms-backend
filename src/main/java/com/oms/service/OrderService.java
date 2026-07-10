package com.oms.service;

import java.util.List;
import java.util.Optional;

import com.oms.entity.Order;

public interface OrderService {

    // Save Order
    Order saveOrder(Order order);

    // Get All Orders
    List<Order> getAllOrders();

    // Get Order By Id
    Optional<Order> getOrderById(Long id);

    // Update Order
    Order updateOrder(Long id, Order order);

    // Delete Order
    void deleteOrder(Long id);

}