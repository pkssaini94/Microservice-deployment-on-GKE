package com.pawan.microservice.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawan.microservice.user.entity.User;
import com.pawan.microservice.user.repository.IUserRepository;
import com.pawan.microservice.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository repository;

	@Override
	public User getUserDetails(Long id) {
		return repository.findById(id).get();
	}

}
