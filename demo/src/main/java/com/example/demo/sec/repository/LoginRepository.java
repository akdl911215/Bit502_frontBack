package com.example.demo.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.sec.domain.Login;

interface LoginCustomRepository {
	
}

public interface LoginRepository extends JpaRepository<Login, Long>,
										 LoginCustomRepository{

}
