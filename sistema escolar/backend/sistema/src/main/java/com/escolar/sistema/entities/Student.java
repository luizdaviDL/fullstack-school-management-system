package com.escolar.sistema.entities;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int registration;
	private String name ;
	private String lasname;
	private String cpf;
	private String rg;
	private String motherName;
	private String fatherName;
	private String telephone;
	private String email;
	private String genre; /*genero*/
	private String birthDate;
	@OneToOne
	private Classe classe; /*Turma*/
	private boolean status;
	
	public Student(Long id, String name, String lasname, String cpf, String rg, String motherName,
			String fatherName, String telephone, String email, String genre, String birthDate, Classe classe) {
		
		/*Random to not repeate numbers*/
		Random random = new Random();
		int number = random. nextInt(10000);
		this.id = id;
		this.registration = number;
		this.name = name;
		this.lasname = lasname;
		this.cpf = cpf;
		this.rg = rg;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.telephone = telephone;
		this.email = email;
		this.genre = genre;
		this.birthDate = birthDate;
		this.classe = classe;
		this.status = true;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
