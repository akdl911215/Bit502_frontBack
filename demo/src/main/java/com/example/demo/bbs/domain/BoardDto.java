package com.example.demo.bbs.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BoardDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long boardNo;
	private String tilte;
	private String content;
	private String writer;
	private Date regDate;
}
