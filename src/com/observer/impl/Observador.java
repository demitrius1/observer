package com.observer.impl;

import com.observer.programas.ProgramaNutricional;
import com.observer.programas.ProgramaTreinamento;

public interface Observador {

	public void atualizar(ProgramaTreinamento progTreino, ProgramaNutricional progNutri);

}