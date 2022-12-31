
package com.maven.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class answer {
	
	@Id
	@Column(name = "answer_id")
	private int answerid;
	private String answer;
	
	@ManyToOne
	private Question question_id;
	
	public answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Question question_id) {
		this.question_id = question_id;
	}
	
	

	
	
}
