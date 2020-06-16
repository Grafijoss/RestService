package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Curso;

public interface ICursoService {
	
	public List<Curso> findAll();
	
	public void saveCurso(Curso curso);
	
	public List<Curso> getCursosProfesor(Long id);

}
