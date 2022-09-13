package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
    AdminDAO dao;
	@Autowired
UserDAO udao;
	
	@PostMapping("/adminlogin")
	public String adminLogin(@RequestBody Admin u)
	{
			return dao.adminLogin(u);
	}
	@PostMapping("/adminupdate")
	public String updateAdmin(@RequestBody Admin u)
	{
			return dao.updateAdmin(u);
	}
	@GetMapping("/quizinfo")
	public Statistics quizinfo()
	{
			return dao.quizInfo();
	}
	@GetMapping("/getresult")
	public List<Result> getresult()
	{
			return dao.result();
	}



}
