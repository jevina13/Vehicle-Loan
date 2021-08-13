package com.lti.mypack.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.AdminDetails;


@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, Integer>{
	List<AdminDetails> findByEmail(String email);
	//AdminDetails getByEmail(String email);

	//List<AdminDetails> findByUname(String username);
	
}
