package br.com.aula01.academicnet.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula01.academicnet.modelo.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

}
