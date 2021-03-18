package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.repository.UserRepositoryImpl;

@Service
public class UserServiceImpl extends AbstractService<User> {
	@Autowired UserRepository repo;
	void test() {
		
	}
	@Override
	public Optional<User> findOne(User t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<User> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// UserDetailsService 의 메소드
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = repo.findByUsername(username);
			if (user == null) {
	            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
	        } else {
	            return user;
	        }
	}
}
