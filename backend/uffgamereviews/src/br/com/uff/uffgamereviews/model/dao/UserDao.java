package br.com.uff.uffgamereviews.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.uff.uffgamereviews.conector.Conector;
import br.com.uff.uffgamereviews.model.User;

public class UserDao implements Dao<User> {
	
	private static List<User> usuarios = new ArrayList<User>();
	
	@Override
	public void save(User user) {
		Connection con = Conector.getConnection();
		PreparedStatement st;
		try {
			st = con.prepareStatement("insert into user values(?,?,?)");
			st.setString(1, user.getEmail());
			st.setString(2, user.getSenha());
			st.setInt(3, user.getEstrelas());
			st.executeUpdate();
			usuarios.add(user);//antes so tinha essa linha
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void delete(int index) {
		usuarios.remove(index);
		
	}

	@Override
	public void lista() {
		usuarios.forEach(usuario -> {
			System.out.println(usuario);
		});
	}

	@Override
	public User get(String email) {
		Connection con = Conector.getConnection();
		PreparedStatement st;
		try {
			st = con.prepareStatement("select senha, estrelas from user where email='"+email+"'");
			ResultSet rs = st.executeQuery();
			User usuario = new User();
			if(rs.next()) {
				usuario.setEmail(email);
				usuario.setSenha(rs.getString(1));
				usuario.setEstrelas(rs.getInt(2));
				con.close();
				return usuario;
			}else {
				con.close();
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}/*
		for (User user : usuarios) {
			if (user.getEmail().equals(email)) return user;
		}
		return null;*/
	}
	
	public User update(String email, User usuario) {
		for (User user : usuarios) {
			if (user.getEmail().equals(email)) {
				delete(usuarios.indexOf(usuario));
				usuarios.add(usuario);
				return usuario;
			}
		}
		return null;
	}
	
}
