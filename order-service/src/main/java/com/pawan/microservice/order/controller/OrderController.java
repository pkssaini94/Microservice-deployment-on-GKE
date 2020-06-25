package com.pawan.microservice.order.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.microservice.order.dto.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@GetMapping(value = "/{id}")
	public ResponseEntity<List<Order>> getOrder(@PathVariable int id) {

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, 250, LocalDate.parse("2020-04-14")));
		orders.add(new Order(2, 450, LocalDate.parse("2020-04-14")));
		return ResponseEntity.ok(orders);

	}

}
