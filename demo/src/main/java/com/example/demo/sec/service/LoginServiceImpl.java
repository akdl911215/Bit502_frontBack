package com.example.demo.sec.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.sec.domain.Login;
import com.example.demo.sec.repository.LoginRepository;

@Service
public class LoginServiceImpl extends AbstractService<Login>{
	@Autowired LoginRepository repo;

	@Override
	public Optional<Login> findOne(Login t) {
		// TODO Auto-generated method stub
		return repo.findOne(null);
	}



	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Login getOne(Long id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}



	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<Login> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
}
