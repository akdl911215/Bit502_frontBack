package com.example.demo.uss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.repository.UserRepositoryImpl;

@Service
public abstract class UserServiceImpl implements UserService {
	@Autowired UserRepository repo;
	void test() {
		
	}
}
