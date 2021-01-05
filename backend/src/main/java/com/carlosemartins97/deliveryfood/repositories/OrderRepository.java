package com.carlosemartins97.deliveryfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosemartins97.deliveryfood.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
