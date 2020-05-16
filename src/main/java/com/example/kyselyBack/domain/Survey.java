package com.example.kyselyBack.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Survey {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "refQuestionSurvey")
	@JsonIgnore
	private List<Question> questions;
	
	@OneToMany(mappedBy = "survey")
	@JsonIgnore
	private List<UniqueUserSession> uniqueUser;
	
	
	public Survey() {
		super();
	}

	public Survey(String name) {
		super();
		this.name = name;
	}

	public Survey(String name, List<Question> questions) {
		super();
		this.name = name;
		this.questions = questions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<UniqueUserSession> getUniqueUser() {
		return uniqueUser;
	}

	public void setUniqueUser(List<UniqueUserSession> uniqueUser) {
		this.uniqueUser = uniqueUser;
	}
	
}
