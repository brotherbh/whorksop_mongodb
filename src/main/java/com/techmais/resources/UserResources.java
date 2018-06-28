package com.techmais.resources;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmais.domain.User;
import com.techmais.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	
	@Autowired
	private UserServices userServ;
	
	
	
	
	@GetMapping()
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = userServ.findAlll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	

}//FP
