package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionDAO {
	@Autowired
	QuestionRepo repo;
	public String addQuestion(Question q)
	{
		if(q!=null)
		{
			repo.save(q);
			return "Question Added Sucessfully";
		}
		else
		{
			return "Question not Added";
		}
		
	}
	public String addallQuestion(List<Question> q)
	{
		if(q!=null)
		{
			repo.saveAll(q);
			return "Question Added Successfully";
		}
		else
		{
			return "Question not Added";
		}
		
	}
	

}
