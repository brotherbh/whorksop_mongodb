package com.techmais.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techmais.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>  {
	
	

}//FP
