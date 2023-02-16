package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.assembler.EmployeeSurveyAssembler;
import com.example.demo.dao.EmployeeSurveyDao;
import com.example.demo.repository.EmployeeSurveyRepository;
import com.example.demo.request.dto.EmployeeSurveyRequestDto;
import com.example.demo.response.dto.EmployeeSurveyResponseDto;
import com.example.demo.service.EmployeeSurveyService;


@Service
public class EmployeeSurveyServiceImpl implements EmployeeSurveyService {

	@Autowired
	private EmployeeSurveyRepository repository;

	@Autowired
	private EmployeeSurveyAssembler assembler;

	@Override
	@Transactional
	public EmployeeSurveyResponseDto save(EmployeeSurveyRequestDto requestDto) {
		EmployeeSurveyDao dao = assembler.prepareDao(requestDto);
		repository.saveAndFlush(dao);
		return assembler.prepareResponseDto(dao);
	}

	@Override
	public EmployeeSurveyResponseDto get(Long surveyId) throws NotFoundException {
		EmployeeSurveyDao dao = repository.findById(surveyId).orElseThrow(() -> new NotFoundException());
		return assembler.prepareResponseDto(dao);
	}

}
