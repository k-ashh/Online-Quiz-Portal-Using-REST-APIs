package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
	@Query("select user from User user where user.useremail=?1")
	public User findByuseremail(String name);
	
	@Query("select user from User user where user.password=?1")
	public User findBypassword(String name);


}
