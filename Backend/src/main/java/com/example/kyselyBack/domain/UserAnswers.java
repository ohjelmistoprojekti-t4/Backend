package com.example.kyselyBack.domain;


import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class UserAnswers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userAnswerId;
	
	private String textAnswer;
	private int type;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Question question;
	
	public UserAnswers() {
		super();
	}
	
	public UserAnswers(String textAnswer, int type, Question question) {
		super();
		this.textAnswer = textAnswer;
		this.type = type;
		this.question = question;
	}

	public Long getUserAnswerId() {
		return userAnswerId;
	}

	public void setUserAnswerId(Long userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public String getTextAnswer() {
		return textAnswer;
	}

	public void setTextAnswer(String textAnswer) {
		this.textAnswer = textAnswer;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	
	

}
