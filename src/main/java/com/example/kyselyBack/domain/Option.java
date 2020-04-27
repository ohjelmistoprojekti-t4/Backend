package com.example.kyselyBack.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Option {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long optionid;
	
	
	
	private String option;
	
	
	@ManyToOne
	private Question refOptionQuestion;


	public Option() {
		super();
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

	
	
	

	

	
	
	
	
}
