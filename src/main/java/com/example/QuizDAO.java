package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuizDAO {
	@Autowired
	QuizRepo repo;
	
	public String addQuiz(Quiz q)
	{
		
		if(q!=null)
		{
			repo.save(q);
			return "Quiz added Successfully";
		}
		else
		{
			return "Quiz not added";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return repo.findAll();
	}
	
	public List<Object>ListOfQuiz()
	{
		return repo.listOfQuiz();
	}
	

}
