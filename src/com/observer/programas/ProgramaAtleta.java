package com.observer.programas;

import java.util.ArrayList;

import com.observer.impl.Observador;
import com.observer.impl.Publicador;

public class ProgramaAtleta implements Publicador {

	private ArrayList<Observador> observadores;
	private ProgramaTreinamento progTreino;
	private ProgramaNutricional progNutri;
	
	public ProgramaAtleta() {
		observadores = new ArrayList<Observador>();
	}
	
	public void incluirObservador(Observador o) {
		observadores.add(o);
	}

	public void excluirObservador(Observador o) {
		int i = observadores.indexOf(o);
		if(i >= 0)
			observadores.remove(i);
	}

	public void notificarObservador() {
		for(int i = 0; i < observadores.size(); i++) {
			Observador observador = (Observador) observadores.get(i);
			observador.atualizar(progTreino, progNutri);
		}
	}

	public void alterarProgramaAtleta() {
		notificarObservador();
	}

	public void setProgramaAtleta(ProgramaTreinamento progTreino, ProgramaNutricional progNutri) {
		this.progTreino = progTreino;
		this.progNutri = progNutri;
		alterarProgramaAtleta();
	}

}