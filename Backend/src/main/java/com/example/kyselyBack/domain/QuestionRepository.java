package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.kyselyBack.domain.Question;

public interface QuestionRepository extends CrudRepository <Question, Long> {
	List<Question> findByQuestion(String question);
}
