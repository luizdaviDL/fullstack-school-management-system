package com.escolar.sistema.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_class")
public class Classe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany
	private List<Student> students;
	@OneToMany
	private List<Subject> subjects; /*materias*/
	@OneToMany
	private List<Teacher> teacher;
	@OneToOne
	private Shift shift; /*turno*/
	
	public Classe(Long id, String name, List<Student> students, List<Subject> subjects, List<Teacher> teacher,
			Shift shift) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
		this.subjects = subjects;
		this.teacher = teacher;
		this.shift = shift;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}
	
	
	
}
