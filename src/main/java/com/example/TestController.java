package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired 
	TestDAO dao;
	
	@PostMapping("/takeTest")
	public String takeTest(@RequestBody Test t)
	{
			return dao.takeTest(t);
	}
	@GetMapping("/getAllTest")
	public List<Test> getAllTest()
	{
			return dao.getTestList();
	}
}
