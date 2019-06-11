package br.com.uff.uffgamereviews.model;

public class User {
	private String username;
	private String email;
	private String senha;
	private int estrelas;
	//private List<Post> notas;
	
	public User() {}
	
	public User(String username, String email, String senha, int estrelas) {
		this.username = username;
		this.email = email;
		this.senha = senha;
		this.estrelas = 10;		
	}
	
	
	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
