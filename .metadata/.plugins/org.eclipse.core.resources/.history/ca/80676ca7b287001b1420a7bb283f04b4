package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

public abstract class AbstractService<T> {
	public abstract Optional<T> findOne(T t);
	public abstract long count();
	public abstract boolean existsById(Long id);
	public abstract List<T> findAllById(Iterable<Long> ids);
	public abstract void deleteById(Long id);
	public abstract T getOne(Long id);
}
