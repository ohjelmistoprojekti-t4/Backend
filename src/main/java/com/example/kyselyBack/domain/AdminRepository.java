package com.example.kyselyBack.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long>{
	List<Admin> findByUserName(String username);
}
