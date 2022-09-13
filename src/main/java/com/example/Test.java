package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "userid")
	private User userid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quid")
	private Quiz quizid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Question questionid;
	private int testans;

}
