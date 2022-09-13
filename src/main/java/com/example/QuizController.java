package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	@Autowired
	QuizDAO dao;
	@PostMapping("/addquiz")
	public String addQuiz(@RequestBody Quiz q)
	{
		
		return dao.addQuiz(q);
	}
	
	
		@GetMapping("/viewquiz")
		public List<Quiz> viewQuiz()
		{
				return dao.viewAllQuiz();
		}
		
		@GetMapping("/listofquiz")
		public List<Object> LisofQuiz()
		{
				return dao.ListOfQuiz();
		}

}
