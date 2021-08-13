package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Eligibility;
@Repository
public interface EligibilityRepository extends JpaRepository<Eligibility, Integer>{

}
