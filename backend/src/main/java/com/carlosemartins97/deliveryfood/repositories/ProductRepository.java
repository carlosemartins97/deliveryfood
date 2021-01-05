package com.carlosemartins97.deliveryfood.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosemartins97.deliveryfood.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findAllByOrderByNameAsc();
}
