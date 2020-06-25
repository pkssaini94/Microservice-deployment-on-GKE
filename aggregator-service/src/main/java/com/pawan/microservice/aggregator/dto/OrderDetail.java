package com.pawan.microservice.aggregator.dto;

import java.util.List;

public class OrderDetail {

	private User userDetails;

	private List<Order> orders;

	public OrderDetail() {
		super();
	}

	public OrderDetail(User userDetails, List<Order> orders) {
		super();
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
