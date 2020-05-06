package com.example.kyselyBack.domain;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class UserAnswer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userAnswerId;
	
	private String textAnswer;
	private int type;
	

	private int refQuestionId;
	private String refQuestionString;
	
	private int refOptionId;
	private String refOptionString;
	
	private int refAnswerSetId;
	

	@JsonBackReference
	@ManyToOne
	private Question refAnswerQuestion;
	
	@JsonBackReference
	@ManyToOne
	private Option refAnswerOption;
	
	@JsonBackReference
	@ManyToOne
	private AnswerSet refAnswerAnswerSet;
	
	
	
	public UserAnswer() {
		super();
	}

	

	public UserAnswer(int type, Question refAnswerQuestion, Option refAnswerOption) {
		super();
		this.type = type;
		this.refAnswerQuestion = refAnswerQuestion;
		this.refAnswerOption = refAnswerOption;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
		this.refOptionId = Math.toIntExact(refAnswerOption.getOptionid());
		this.refOptionString = refAnswerOption.getOption();
		
	}


	public UserAnswer(int type, Question refAnswerQuestion, AnswerSet refAnswerAnswerSet) {
		super();
		this.type = type;
		this.refAnswerQuestion = refAnswerQuestion;
		this.refAnswerAnswerSet = refAnswerAnswerSet;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
		this.refAnswerSetId = Math.toIntExact(refAnswerAnswerSet.getAnswerSetId());
	}



	public UserAnswer(String textAnswer, int type, Question refAnswerQuestion, AnswerSet refAnswerAnswerSet) {
		super();
		this.textAnswer = textAnswer;
		this.type = type;
		this.refAnswerQuestion = refAnswerQuestion;
		this.refAnswerAnswerSet = refAnswerAnswerSet;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
		this.refAnswerSetId = Math.toIntExact(refAnswerAnswerSet.getAnswerSetId());
	}



	public UserAnswer(String textAnswer, int type, int refQuestionId, String refQuestionString, int refOptionId,
			String refOptionString, int refAnswerSetId, Question refAnswerQuestion, Option refAnswerOption,
			AnswerSet refAnswerAnswerSet) {
		super();
		this.textAnswer = textAnswer;
		this.type = type;
		this.refQuestionId = refQuestionId;
		this.refQuestionString = refQuestionString;
		this.refOptionId = refOptionId;
		this.refOptionString = refOptionString;
		this.refAnswerSetId = refAnswerSetId;
		this.refAnswerQuestion = refAnswerQuestion;
		this.refAnswerOption = refAnswerOption;
		this.refAnswerAnswerSet = refAnswerAnswerSet;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
		this.refOptionId = Math.toIntExact(refAnswerOption.getOptionid());
		this.refOptionString = refAnswerOption.getOption();
		
		this.refAnswerSetId = Math.toIntExact(refAnswerAnswerSet.getAnswerSetId());
	}



	public UserAnswer(int type, Question refAnswerQuestion, Option refAnswerOption, AnswerSet refAnswerAnswerSet) {
		super();
		this.type = type;
		this.refAnswerQuestion = refAnswerQuestion;
		this.refAnswerOption = refAnswerOption;
		this.refAnswerAnswerSet = refAnswerAnswerSet;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
		this.refOptionId = Math.toIntExact(refAnswerOption.getOptionid());
		this.refOptionString = refAnswerOption.getOption();
		
		this.refAnswerSetId = Math.toIntExact(refAnswerAnswerSet.getAnswerSetId());
	}



	public UserAnswer(String textAnswer, int type, Question refAnswerQuestion) {
		super();
		this.textAnswer = textAnswer;
		this.type = type;
		this.refAnswerQuestion = refAnswerQuestion;
		
		this.refQuestionId = Math.toIntExact(refAnswerQuestion.getId());
		this.refQuestionString = refAnswerQuestion.getQuestion();
		
	}



	public int getRefQuestionId() {
		return refQuestionId;
	}



	public void setRefQuestionId(int refQuestionId) {
		this.refQuestionId = refQuestionId;
	}



	public int getRefOptionId() {
		return refOptionId;
	}



	public void setRefOptionId(int refOptionId) {
		this.refOptionId = refOptionId;
	}



	public String getRefOptionString() {
		return refOptionString;
	}



	public void setRefOptionString(String refOptionString) {
		this.refOptionString = refOptionString;
	}



	public int getRefAnswerSetId() {
		return refAnswerSetId;
	}



	public void setRefAnswerSetId(int refAnswerSetId) {
		this.refAnswerSetId = refAnswerSetId;
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


	public String getRefQuestionString() {
		return refQuestionString;
	}



	public void setRefQuestionString(String refQuestionString) {
		this.refQuestionString = refQuestionString;
	}



	public Question getRefAnswerQuestion() {
		return refAnswerQuestion;
	}



	public void setRefAnswerQuestion(Question refAnswerQuestion) {
		this.refAnswerQuestion = refAnswerQuestion;
	}



	public Option getRefAnswerOption() {
		return refAnswerOption;
	}



	public void setRefAnswerOption(Option refAnswerOption) {
		this.refAnswerOption = refAnswerOption;
	}



	public AnswerSet getRefAnswerAnswerSet() {
		return refAnswerAnswerSet;
	}



	public void setRefAnswerAnswerSet(AnswerSet refAnswerAnswerSet) {
		this.refAnswerAnswerSet = refAnswerAnswerSet;
	}
	
	

	

}
