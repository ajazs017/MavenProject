package com.maven.Map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "question_Id")
	private int questionID;
	
	private String Question;
	
	@OneToMany(mappedBy = "question_id")
	private List<answer> answers;

	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Question(List<answer> answers) {
		super();
		this.answers = answers;
	}




	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}



	public List<answer> getAnswers() {
		return answers;
	}



	public void setAnswers(List<answer> answers) {
		this.answers = answers;
	}

	

	
}
