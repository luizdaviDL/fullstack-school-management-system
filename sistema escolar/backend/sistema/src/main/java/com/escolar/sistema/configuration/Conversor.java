package com.escolar.sistema.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.escolar.sistema.entities.Student;
import com.escolar.sistema.save.StudentGetDatas;


@Component
public class Conversor {
	@Autowired
	private ModelMapper mapper;
	
	public Student student (StudentGetDatas data) {
		return mapper.map(data, Student.class); 
	} 
}
