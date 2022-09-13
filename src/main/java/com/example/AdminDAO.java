package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class AdminDAO {
	List<Result> finalList=new ArrayList<>();
	@Autowired
	UserRepo urepo;
	@Autowired
	AdminRepo repo;
	@Autowired
	QuestionRepo qrepo;
	@Autowired
	QuizRepo qurepo;
	@Autowired
	Statistics stat;
	@Autowired
	TestRepo tr;
	public String adminLogin(Admin u)
	{
		Admin ad= repo.findById(1).get();
		if(u.getAdminname().equals(ad.getAdminname())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Hii Admin!Weclome to online quiz portal";
		}
		else
		{
			return "Invalid Login Credentials";
		}
	}
	public String updateAdmin(Admin a) {
		Admin ad= repo.findById(1).get();
		ad.setAdminname(a.getAdminname());
		ad.setPassword(a.getPassword());
		repo.save(ad);
		return " Details Updated Successfully";
	}
	public Statistics quizInfo()
	{
		stat.setUsers(urepo.findAll().size());
		stat.setQuestions(qrepo.findAll().size());
		stat.setQuiz(qurepo.findAll().size());
		
		return stat;

	}
	public List<Result> result()
	{	
		String email="";
		int mark=0;
		List<Test> obj=tr.findAll();
		List<User> u= urepo.findAll();
		for (User user : u) {
			mark=0;
			email=user.getUseremail();
			System.out.println(user.getUseremail());
			
			for(Test tt :obj)
			{
				if(user.getUserid()==tt.getUserid().getUserid())
				{
					
					if(tt.getTestans()==tt.getQuestionid().getAns())
					{
						mark++;
					}
					System.out.println("inside"+mark);
					
				}
			}
			System.out.println("outside"+mark);
		
			
			finalList.add(new Result(email,mark));
			
			
			
		}
		System.out.println("final :"+mark);
		
		Collections.sort(finalList);
		
		return finalList;
		
	}
	


}
