package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class QuestionController {
	@Autowired
	QuestionDAO dao;
	@PostMapping("/addquestions")
	public String addQuestion(@RequestBody Question q)
	{
			return dao.addQuestion(q);
	}
	@PostMapping("/addallquestions")
	public String addallQuestion(@RequestBody List<Question> q)
	{
			return dao.addallQuestion(q);
	}

}
