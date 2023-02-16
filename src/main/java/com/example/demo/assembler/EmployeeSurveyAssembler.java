package com.example.demo.assembler;

import org.springframework.beans.BeanUtils;

import com.example.demo.dao.EmployeeSurveyDao;
import com.example.demo.request.dto.EmployeeSurveyRequestDto;
import com.example.demo.response.dto.EmployeeSurveyResponseDto;

public class EmployeeSurveyAssembler {

	public EmployeeSurveyDao prepareDao(EmployeeSurveyRequestDto requestDto) {
		EmployeeSurveyDao dao = new EmployeeSurveyDao();
		BeanUtils.copyProperties(requestDto, dao);
		return dao;
	}

	public EmployeeSurveyResponseDto prepareResponseDto(EmployeeSurveyDao dao) {
		EmployeeSurveyResponseDto response = new EmployeeSurveyResponseDto();
		BeanUtils.copyProperties(dao, response);
		return response;
	}
}
