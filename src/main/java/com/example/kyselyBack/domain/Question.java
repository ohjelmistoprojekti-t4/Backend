package com.example.kyselyBack.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.kyselyBack.domain.QuestionRepository;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Question {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String question;
	private int type;
	
	
	
	@ManyToOne
	private Survey refQuestionSurvey;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "refAnswerQuestion")
	private List<UserAnswer> answers;
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "refOptionQuestion")
    private List<Option> options;
    
	public Question() {
    	super();
    }

	public Question(String question, int type) {
		super();
		this.question = question;
		this.type = type;
		
	}


	public Question(String question, int type, List<UserAnswer> answers, List<Option> options) {
		super();
		this.question = question;
		this.type = type;
		this.answers = answers;
		this.options = options;
		
	}

	public Question(String question, int type, List<Option> options) {
		super();
		this.question = question;
		this.type = type;
		this.options = options;
		
	}

	public Question(String question, int type, Survey refQuestionSurvey, List<UserAnswer> answers,
			List<Option> options) {
		super();
		this.question = question;
		this.type = type;
		this.refQuestionSurvey = refQuestionSurvey;
		this.answers = answers;
		this.options = options;
		
	}

	public Question(String question, int type, Survey refQuestionSurvey) {
		super();
		this.question = question;
		this.type = type;
		this.refQuestionSurvey = refQuestionSurvey;
		
	}
	

	public Survey getRefQuestionSurvey() {
		return refQuestionSurvey;
	}

	public void setRefQuestionSurvey(Survey refQuestionSurvey) {
		this.refQuestionSurvey = refQuestionSurvey;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getType() {
		return type;
	}
	

	public void setType(int type) {
		this.type = type;
	}

	public List<UserAnswer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<UserAnswer> answers) {
		this.answers = answers;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Survey getSurvey() {
		return refQuestionSurvey;
	}

	public void setSurvey(Survey survey) {
		this.refQuestionSurvey = survey;
	}

}

