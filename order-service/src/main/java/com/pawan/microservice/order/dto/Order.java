package com.pawan.microservice.order.dto;

import java.time.LocalDate;

public class Order {

	private int orderId;

	private int orderAmount;

	private LocalDate orderDate;

	public Order() {
		super();
	}

	public Order(int orderId, int orderAmount, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

}
