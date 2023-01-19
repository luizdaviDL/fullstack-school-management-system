package com.escolar.sistema.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.sistema.save.StudentGetDatas;
import com.escolar.sistema.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	private StudentService service;
	/*Save*/
	@PostMapping
	public void saveData(@RequestBody StudentGetDatas a) {
		service.save(a);
	}
	
	/*Get*//*
	@GetMapping(value="/all")
	public List<Student> getS() {
		return repository.findAll();
	}*/
	
}
