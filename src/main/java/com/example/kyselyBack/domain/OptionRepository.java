package com.example.kyselyBack.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.kyselyBack.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {
	
}