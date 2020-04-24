package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserAnswersRepository extends CrudRepository<UserAnswers, Long>{
	List<UserAnswers> findByTextAnswer(String textAnswer);
}
