package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface UserAnswersRepository extends CrudRepository<UserAnswer, Long>{
//	List<UserAnswer> findByTextAnswer(String textAnswer);
	List<UserAnswer> findAllByRefAnswerOption(Option option);
	List<UserAnswer> findAllByRefAnswerQuestion(Question question);
}
