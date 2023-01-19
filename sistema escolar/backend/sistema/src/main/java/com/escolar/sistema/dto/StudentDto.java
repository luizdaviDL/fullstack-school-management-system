package com.escolar.sistema.dto;


public class StudentDto {
	private Long id;
	private int registration;
	private String name ;
	private String lasname;
	private String motherName;
	private String fatherName;
	private String birthDate;
	
	public StudentDto() {
		super();
	}
	public StudentDto(Long id, int registration, String name, String lasname, String motherName, String fatherName,
			String birthDate) {
		super();
		this.id = id;
		this.registration = registration;
		this.name = name;
		this.lasname = lasname;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.birthDate = birthDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLasname() {
		return lasname;
	}
	public void setLasname(String lasname) {
		this.lasname = lasname;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
