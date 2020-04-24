package com.example.kyselyBack.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Option {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long optionid;
	
	private String option1;
	
	private String option2;

	private String option3;
	
	private String option4;
	
	private String option5;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Question> question;
	
	public Option() {
		super();
	}
	
	public Option(String option1, String option2, String option3, String option4, String option5) {
		super();
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
	}

	public Long getId() {
		return optionid;
	}

	public void setId(Long optionid) {
		this.optionid = optionid;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}
	
	
}
