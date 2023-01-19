package com.escolar.sistema.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolar.sistema.repository.StudentRepository;
import com.escolar.sistema.save.StudentGetDatas;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	/*save*/
	public void save(StudentGetDatas a) {
		
		repository.save(a);
		
	}
	
	/*save*/
	
	
}
