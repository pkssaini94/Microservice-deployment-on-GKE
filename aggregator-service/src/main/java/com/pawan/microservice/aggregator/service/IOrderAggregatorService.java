package com.pawan.microservice.aggregator.service;

import com.pawan.microservice.aggregator.dto.OrderDetail;

public interface IOrderAggregatorService {

	OrderDetail getOrderDetails(int id);

}
