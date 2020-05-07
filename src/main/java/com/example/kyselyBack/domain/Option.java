package com.example.kyselyBack.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Option {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long optionid;
	
	private String option;
	
	@ManyToOne
	private Question refOptionQuestion;
	
	@OneToMany(mappedBy = "refAnswerOption")
	private List<UserAnswer> answers;


	public Option() {
		super();
	}
	
	
	
	public Option(String option, Question refOptionQuestion, List<UserAnswer> answers) {
		super();
		this.option = option;
		this.refOptionQuestion = refOptionQuestion;
		this.answers = answers;
	}



	public Option(String option, Question refOptionQuestion) {
		super();
		this.option = option;
		this.refOptionQuestion = refOptionQuestion;
	}

	public Long getOptionid() {
		return optionid;
	}

	public void setOptionid(Long optionid) {
		this.optionid = optionid;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Question getRefOptionQuestion() {
		return refOptionQuestion;
	}

	public void setRefOptionQuestion(Question refOptionQuestion) {
		this.refOptionQuestion = refOptionQuestion;
	}



	public List<UserAnswer> getAnswers() {
		return answers;
	}



	public void setAnswers(List<UserAnswer> answers) {
		this.answers = answers;
	}
	
	
}
