package com.carlosemartins97.deliveryfood.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlosemartins97.deliveryfood.dto.OrderDTO;
import com.carlosemartins97.deliveryfood.dto.ProductDTO;
import com.carlosemartins97.deliveryfood.entities.Order;
import com.carlosemartins97.deliveryfood.entities.OrderStatus;
import com.carlosemartins97.deliveryfood.entities.Product;
import com.carlosemartins97.deliveryfood.repositories.OrderRepository;
import com.carlosemartins97.deliveryfood.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(),
				Instant.now(), OrderStatus.PENDING);
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = repository.save(order);
		return new OrderDTO(order);
	}
}
