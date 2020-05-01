package com.example.kyselyBack.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long answerSetId;
	
	@ManyToOne
	private UserAnswer answerId;
	
	public AnswerSet() {
		super();
	}
	
	public AnswerSet(UserAnswer answerId) {
		super();
		this.answerId = answerId;
	}


	public Long getAnswerSetId() {
		return answerSetId;
	}

	public void setAnswerSetId(Long answerSetId) {
		this.answerSetId = answerSetId;
	}

	public UserAnswer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(UserAnswer answerId) {
		this.answerId = answerId;
	}
}
