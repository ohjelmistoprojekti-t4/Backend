package com.example.kyselyBack.domain;

import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository <Survey, Long> {
	Survey findOneById(long id);
}
