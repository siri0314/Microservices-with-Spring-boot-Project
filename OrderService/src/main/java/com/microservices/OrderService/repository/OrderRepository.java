package com.microservices.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservices.OrderService.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
