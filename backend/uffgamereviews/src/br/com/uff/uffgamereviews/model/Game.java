package br.com.uff.uffgamereviews.model;

public class Game {
	private String nome;
	private String descricao;
	private String capa;
	private int nota;
	
	public Game(String nome, String descricao, String capa, int nota) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.capa = capa;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

}
