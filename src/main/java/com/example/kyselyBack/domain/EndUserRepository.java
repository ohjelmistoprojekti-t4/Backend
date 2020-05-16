package com.example.kyselyBack.domain;

import org.springframework.data.repository.CrudRepository;

public interface EndUserRepository extends CrudRepository<EndUser, Long>{

	EndUser findByUsername(String username);

}
