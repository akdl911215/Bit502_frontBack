package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.example.demo.bbs.domain.Board;
import com.example.demo.uss.domain.User;

public interface BoardService {
	public Optional<Board> findOne(Board t);
	public long count();
	public boolean existsById(Long id);
	public <Board> User save(User entity);
	public <UsBoarder> Optional<Board> findOne(Example<Board> example);
	public List<Board> findAllById(Iterable<Long> ids);
	public void deleteById(Long id);
	public User getOne(Long id);
}
