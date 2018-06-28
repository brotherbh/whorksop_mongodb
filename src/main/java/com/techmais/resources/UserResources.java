package com.techmais.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmais.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	
	
	@GetMapping()
	public ResponseEntity<List<User>> findAll(){

		List<User> list = new ArrayList<>();
		
		User maria = new User("1","Maria maria", "maria@gmail.com");

		User jose = new User("2","Jose maria", "jose@gmail.com");
	
		User bento = new User("1","Bento maria", "bento@gmail.com");
		
			list.addAll(Arrays.asList(maria,jose,bento));
		return ResponseEntity.ok().body(list);
		
	}
	
	

}//FP
