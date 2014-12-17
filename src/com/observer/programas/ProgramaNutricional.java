package com.observer.programas;

public class ProgramaNutricional {

	private int id;
	private String data;
	private String descricao;

	public ProgramaNutricional(int id, String data, String descricao) {
		this.id = id;
		this.data = data;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}