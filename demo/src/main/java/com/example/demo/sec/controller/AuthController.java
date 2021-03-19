package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sec.domain.Login;
import com.example.demo.sec.service.LoginService;
import com.example.demo.uss.domain.UserDto;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserDto user) {
		Map<String, Object> map = new HashMap<>();
		
//		Login loginUser = LoginService.user(loginInfo);
//		if(loginUser == null) {
//			map.put("resCd", 9999);
//			map.put("resMsg", "로그인 실패");
//		} else {
//			map.put("token", loginUser.getU_token());
//			map.put("resCd", "0000");
//			map.put("resMsg", "로그인 성공");
//		}
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

}