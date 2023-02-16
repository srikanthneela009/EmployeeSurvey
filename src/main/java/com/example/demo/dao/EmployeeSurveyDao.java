package com.example.demo.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "emplyeeSurvey")
@Table(name = "EMPLOYEE_SURVEY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSurveyDao {

	@Id
	@SequenceGenerator(name = "employee_survey_seq", sequenceName = "employee_survey_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_survey_seq")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "WORK_CULTURE")
	private String workCulture;

	@Column(name = "HAPPY_WITH_MANAGEMENT")
	private String happyWithManagement;

	@Column(name = "HAPPY_AT_WORK")
	private String happyAtWork;

	@Column(name = "RATE_WORK_EXPERIENCE")
	private Integer rateWorkExperience;

	@Column(name = "HAPPY_OR_SAD_DAY")
	private String happyOrSadDay;

}
