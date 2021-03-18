package com.example.demo.uss.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public class UserRepositoryImpl implements UserCustomRepository{

	@Override
	public UserDto login(String username, String password) {
		return null;
	}



	
}
