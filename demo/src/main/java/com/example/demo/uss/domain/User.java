package com.example.demo.uss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {

	@Id
	@GeneratedValue
	
	@Column(name = "user_no")
	private long userNo;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "passwd")
	private String passwd;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
}
