package com.observer.atleta;

import com.observer.impl.Observador;
import com.observer.impl.Publicador;
import com.observer.programas.ProgramaTreinamento;
import com.observer.programas.ProgramaNutricional;

public class Atleta implements Observador {

	private int id;
	private String Nome;
	private int idade;
	private Publicador programaAtleta;
	private ProgramaTreinamento progTreino;
	private ProgramaNutricional progNutri;

	public Atleta(Publicador programaAtleta) {
		this.programaAtleta = programaAtleta;
		programaAtleta.incluirObservador(this);
	}

	public void atualizar(ProgramaTreinamento progTreino, ProgramaNutricional progNutri) {
		this.progTreino = progTreino;
		this.progNutri = progNutri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}