package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.example.demo.bbs.domain.Article;


public interface ArticleService {
	public Optional<Article> findOne(Article t);
	public long count();
	public boolean existsById(Long id);
	public <Article> Article save(Article entity);
	public <Article> Optional<Article> findOne(Example<Article> example);
	public List<Article> findAllById(Iterable<Long> ids);
	public void deleteById(Long id);
	public Article getOne(Long id);
}
