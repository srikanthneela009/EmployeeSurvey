package com.example.demo.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSurveyResponseDto {
	private String firstName;
	private String lastName;
	private String workCulture;
	private String happyWithManagement;
	private String happyAtWork;
	private Integer rateWorkExperience;
	private String happyOrSadDay;
}
