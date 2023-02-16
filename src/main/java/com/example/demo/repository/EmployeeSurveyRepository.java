package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmployeeSurveyDao;

@Repository
public interface EmployeeSurveyRepository extends JpaRepository<EmployeeSurveyDao, Long> {

}
