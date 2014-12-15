package com.observer.impl;

import com.observer.impl.Observador;

public interface Publicador {

	public void incluirObservador(Observador o);
	public void excluirObservador(Observador o);
	public void notificarObservador();

}