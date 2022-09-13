package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	@Autowired
	UserRepo repo;
	public String UserRegister(User u)
	
	{
		
		if(repo.findByuseremail(u.getUseremail())==null)
		{
			repo.save(u);
			return "Registered Succesffuly..Login to continue";
		}
		else
		{
			return "User already exists";
		}
	}
	public String UserLogin(String useremail,String password) {
		User ul=repo.findByuseremail(useremail);
		User pwd=repo.findBypassword(password);
		if(ul!=null&&pwd!=null) {
		
		if(ul.getUseremail().equals(useremail)&&ul.getPassword().equals(password)) {
			return "Logged in";
		}
		
		else
		{
			return "Invalid Credentials";
		}
		}
		return "useremail and password must be value";
	}
	
	

}
