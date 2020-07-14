package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepo;

	@Override
	public String sayHello() {
		return loginRepo.sayHello();
	}

}
