package com.pawan.microservice.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.microservice.aggregator.dto.OrderDetail;
import com.pawan.microservice.aggregator.service.IOrderAggregatorService;

@RestController
@RequestMapping(value = "/orderdetails")
public class AggregatorController {

	@Autowired
	private IOrderAggregatorService aggregatorService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderDetail> getOrderDetail(@PathVariable int id) {
		return ResponseEntity.ok(aggregatorService.getOrderDetails(id));
	}
}
