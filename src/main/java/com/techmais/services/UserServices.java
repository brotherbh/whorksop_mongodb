package com.techmais.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmais.domain.User;
import com.techmais.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAlll(){
		
		List<User> listaU = userRepository.findAll();
		return listaU;
		
	}
	
	

}//FP
