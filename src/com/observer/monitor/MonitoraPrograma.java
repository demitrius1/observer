package com.observer.monitor;

import com.observer.impl.Observador;
import com.observer.impl.PainelPrograma;
import com.observer.impl.Publicador;
import com.observer.programas.ProgramaTreinamento;
import com.observer.programas.ProgramaNutricional;

public class MonitoraPrograma implements Observador, PainelPrograma {

	private Publicador programaAtleta;
	private ProgramaTreinamento progTreino;
	private ProgramaNutricional progNutri;

	public MonitoraPrograma(Publicador programaAtleta) {
		this.programaAtleta = programaAtleta;
		programaAtleta.incluirObservador(this);
	}

	public void atualizar(ProgramaTreinamento progTreino, ProgramaNutricional progNutri) {
		this.progTreino = progTreino;
		this.progNutri = progNutri;
	}

	public void mostrar() {
		System.out.println("Programa Treinamento: " + progTreino.getDescricao());
		System.out.println("Programa Nutricional: " + progNutri.getDescricao());
	}

}