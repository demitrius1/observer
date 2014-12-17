package com.observer.app;

import com.observer.monitor.MonitoraPrograma;
import com.observer.programas.ProgramaAtleta;
import com.observer.programas.ProgramaNutricional;
import com.observer.programas.ProgramaTreinamento;

public class MonitorProgramaAtleta {

	public static void main(String[] args) {

		ProgramaTreinamento progTreino = new ProgramaTreinamento(001,"10/12/2014","Pedalar 80 KM por dia");
		ProgramaNutricional progNutri = new ProgramaNutricional(001,"10/12/2014","Dieta de Carboidratos");
		
		ProgramaAtleta programaAtleta = new ProgramaAtleta();
		MonitoraPrograma monitoraPrograma = new MonitoraPrograma(programaAtleta);
		
		programaAtleta.setProgramaAtleta(progTreino, progNutri);
		
	}
}