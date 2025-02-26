package com.calygam.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calygam.back.dtos.RegisterDTO;
import com.calygam.back.services.UserServices;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {
	@Autowired
	private UserServices service;
	@PostMapping("/register")
	public ResponseEntity<?> CreateOneNewUserInMyBase(@RequestBody RegisterDTO data)throws Exception{
		if(service.userExistentInMyBaseService(data.getUserEmail(),data.getUserCpf())) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já está cadastrado!");
		}else {

			return 	service.CreateOneNewUserInMyBaseService(
					data.getUserName(),
					data.getUserEmail(),
					data.getUserPassword(),
					data.getUserTelefone(),
					data.getUserCpf(),
					data.getUserMoney(),
					data.getUserRank().BRONZEI.name(),
					data.getUserRole().INSTRUTOR.name());
					
		}
				
	}
}
