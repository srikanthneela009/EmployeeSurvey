package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.dto.EmployeeSurveyRequestDto;
import com.example.demo.response.dto.EmployeeSurveyResponseDto;
import com.example.demo.service.EmployeeSurveyService;

@RestController
@RequestMapping("/survey")
public class EmployeeSurveyController {

	@Autowired
	private EmployeeSurveyService service;

	@PostMapping
	public ResponseEntity<EmployeeSurveyResponseDto> save(@RequestBody @Validated EmployeeSurveyRequestDto requestDto)
			throws Exception {
		return new ResponseEntity<>(service.save(requestDto), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeSurveyResponseDto> get(@PathVariable("id") Long id) throws NotFoundException {
		return new ResponseEntity<>(service.get(id), HttpStatus.OK);
	}

}
