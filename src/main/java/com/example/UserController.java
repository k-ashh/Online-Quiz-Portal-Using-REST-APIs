package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserDAO dao;
	
		@PostMapping("/userlogin")
		public String UserLogin(@RequestBody User u)
		{
				return dao.UserLogin(u.getUseremail(),u.getPassword());
		}
		
		
		@PostMapping("/userregister")
		public String UserRegiter(@RequestBody User u)
		{
			return dao.UserRegister(u);
		}
		

}
