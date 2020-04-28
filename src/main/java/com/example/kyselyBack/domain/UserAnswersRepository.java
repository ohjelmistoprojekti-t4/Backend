package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserAnswersRepository extends CrudRepository<UserAnswer, Long>{
	List<UserAnswer> findByTextAnswer(String textAnswer);
}
