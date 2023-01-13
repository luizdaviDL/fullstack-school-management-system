package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name ;
	private String lasname;
	private String cpf;
	private String rg;
	private String telephone;
	private String email;
	private String genre; /*genero*/
	private String birthDate;
	private List<Subject> especialty;
	private boolean status;
	
	public Teacher(Long id, String name, String lasname, String cpf, String rg, String telephone, String email,
			String genre, String birthDate, List<Subject> especialty) {
		super();
		this.id = id;
		this.name = name;
		this.lasname = lasname;
		this.cpf = cpf;
		this.rg = rg;
		this.telephone = telephone;
		this.email = email;
		this.genre = genre;
		this.birthDate = birthDate;
		this.especialty = especialty;
		this.status = true;
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

	public List<Subject> getEspecialty() {
		return especialty;
	}

	public void setEspecialty(List<Subject> especialty) {
		this.especialty = especialty;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
