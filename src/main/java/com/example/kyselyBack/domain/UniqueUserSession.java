package com.example.kyselyBack.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UniqueUserSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uniqueId;
	
	@ManyToOne
	private Survey survey;
	
	@ManyToOne
	private AnswerSet answerSet;
	
	public UniqueUserSession() {
		super();
	}
	
	public UniqueUserSession(Survey survey, AnswerSet answerSet) {
		super();
		this.survey = survey;
		this.answerSet = answerSet;
	}

	public Long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public AnswerSet getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(AnswerSet answerSet) {
		this.answerSet = answerSet;
	}
}
