package br.com.uff.uffgamereviews.model.dao;

import br.com.uff.uffgamereviews.model.User;

public class UserLogin {
	
	public static User Login(String email, String senha) {
		UserDao dao = new UserDao();
		User usuario = dao.get(email);
		
		if (usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
				
		} else {
			System.out.println("Usuario nao encontrado");
		}
		
		return null;
	}
	
}
