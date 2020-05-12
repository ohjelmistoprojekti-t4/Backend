package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.kyselyBack.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {
	List<Option> findByRefOptionQuestion(Question question);
}