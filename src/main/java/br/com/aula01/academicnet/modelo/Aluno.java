package br.com.aula01.academicnet.modelo;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Aluno {

	@Id
	private Long matricula;
	private String nome;
	private String telefone;
	private String email;
	private Instant dataCadastro;
	
	public Aluno() {
	}
	
	public Aluno(Long matricula, String nome, String telefone, String email, Instant dataCadastro) {
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataCadastro = dataCadastro;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
