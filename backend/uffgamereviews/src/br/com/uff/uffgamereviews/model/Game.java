package br.com.uff.uffgamereviews.model;

public class Game {
	private int idJogo;
	private String nome;
	private String descricao;
	private String capa;
	private int nota;
	private User owner;
	
	public Game(int idJogo, String nome, String descricao, String capa, int nota, User owner) {
		super();
		this.idJogo = idJogo;
		this.nome = nome;
		this.descricao = descricao;
		this.capa = capa;
		this.nota = nota;
		this.owner = owner;
	}
	public Game() {}
	public int getIdJogo() {
		return idJogo;
	}
	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
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
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}
