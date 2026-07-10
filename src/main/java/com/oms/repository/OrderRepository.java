package com.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}