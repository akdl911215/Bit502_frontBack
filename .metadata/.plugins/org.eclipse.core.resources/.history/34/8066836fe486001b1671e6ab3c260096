package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.example.demo.uss.domain.User;

public interface UserService {

		public Optional<User> findOne(User t);
		public long count();
		public boolean existsById(Long id);
		public <User> User save(User entity);
		public <User> Optional<User> findOne(Example<User> example);
		public List<User> findAllById(Iterable<Long> ids);
		public void deleteById(Long id);
		public User getOne(Long id);

}
