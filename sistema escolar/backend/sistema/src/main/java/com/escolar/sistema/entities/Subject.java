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
@Table(name="tb_subject")
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToOne
	private Level nivel;
	@OneToMany
	private List<Teacher> teacher;
	
	
	public Subject() {
		super();
	}

	public Subject(Long id, String name, Level nivel, List<Teacher> teacher) {
		super();
		this.id = id;
		this.name = name;
		this.nivel = nivel;
		this.teacher = teacher;
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

	public Level getNivel() {
		return nivel;
	}

	public void setNivel(Level nivel) {
		this.nivel = nivel;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	
	
	
}
