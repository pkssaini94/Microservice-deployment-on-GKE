package com.pawan.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.microservice.user.entity.User;
import com.pawan.microservice.user.service.IUserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUserDetails(@PathVariable Long id) {
		return ResponseEntity.ok(userService.getUserDetails(id));
	}

}
