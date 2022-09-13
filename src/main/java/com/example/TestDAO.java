package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	@Autowired
	TestRepo repo;
	public String takeTest(Test t)
	{
		if(t!=null)
		{
			repo.save(t);
			return "submitted";
		}
		
		else
		{
			return "submission failed";
		}
			
	}
	public List<Test> getTestList()
	{
		return repo.findAll();
	}

}
