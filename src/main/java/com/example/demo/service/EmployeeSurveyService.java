package com.example.demo.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.example.demo.request.dto.EmployeeSurveyRequestDto;
import com.example.demo.response.dto.EmployeeSurveyResponseDto;

public interface EmployeeSurveyService {

	EmployeeSurveyResponseDto save(EmployeeSurveyRequestDto requestDto);

	EmployeeSurveyResponseDto get(Long surveyId) throws NotFoundException;
}
