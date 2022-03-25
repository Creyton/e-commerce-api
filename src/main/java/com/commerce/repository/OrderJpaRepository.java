package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.model.Order;

public interface OrderJpaRepository extends JpaRepository<Order, Long>{

}
