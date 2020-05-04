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
	
	
	
	@OneToMany(mappedBy = "refAnswerAnswerSet")
	private List<UserAnswer> userAnswers;
	
	@OneToMany(mappedBy = "answerSet")
	private List<UniqueUserSession> uniqueUser;
	
	public AnswerSet() {
		super();
	}
	
	

	public AnswerSet(List<UserAnswer> userAnswers) {
		super();
		this.userAnswers = userAnswers;
	}



	public AnswerSet(List<UserAnswer> userAnswers, List<UniqueUserSession> uniqueUser) {
		super();
		this.userAnswers = userAnswers;
		this.uniqueUser = uniqueUser;
	}




	public Long getAnswerSetId() {
		return answerSetId;
	}

	public void setAnswerSetId(Long answerSetId) {
		this.answerSetId = answerSetId;
	}

	

	

	public List<UniqueUserSession> getUniqueUser() {
		return uniqueUser;
	}

	public void setUniqueUser(List<UniqueUserSession> uniqueUser) {
		this.uniqueUser = uniqueUser;
	}



	public List<UserAnswer> getUserAnswers() {
		return userAnswers;
	}



	public void setUserAnswers(List<UserAnswer> userAnswers) {
		this.userAnswers = userAnswers;
	}
	
	
}
