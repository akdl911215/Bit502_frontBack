package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.example.demo.bbs.domain.Board;

public interface BoardService {
	public Optional<Board> findOne(Board t);
	public long count();
	public boolean existsById(Long id);
	public <Board> Board save(Board entity);
	public <Board> Optional<Board> findOne(Example<Board> example);
	public List<Board> findAllById(Iterable<Long> ids);
	public void deleteById(Long id);
	public Board getOne(Long id);
}
