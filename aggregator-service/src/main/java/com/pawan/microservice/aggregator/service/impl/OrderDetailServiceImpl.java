package com.pawan.microservice.aggregator.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pawan.microservice.aggregator.dto.Order;
import com.pawan.microservice.aggregator.dto.OrderDetail;
import com.pawan.microservice.aggregator.dto.User;
import com.pawan.microservice.aggregator.service.IOrderAggregatorService;

@Service
public class OrderDetailServiceImpl implements IOrderAggregatorService {

	@Value("${order.service}")
	private String orderUrl;

	@Value("${user.service}")
	private String userUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderDetail getOrderDetails(int id) {

		User user = restTemplate.getForEntity(userUrl + "/user/" + id, User.class).getBody();
		Order[] orders = restTemplate.getForEntity(orderUrl + "/orders/" + id, Order[].class).getBody();

		return new OrderDetail(user, Arrays.asList(orders));
	}

}