package com.example.kyselyBack.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AnswerSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long answerSetId;
	
	@ManyToOne
	private UserAnswer answerId;
	
	@OneToMany(mappedBy = "answerSet")
	private List<UniqueUserSession> uniqueUser;
	
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

	public List<UniqueUserSession> getUniqueUser() {
		return uniqueUser;
	}

	public void setUniqueUser(List<UniqueUserSession> uniqueUser) {
		this.uniqueUser = uniqueUser;
	}
}
