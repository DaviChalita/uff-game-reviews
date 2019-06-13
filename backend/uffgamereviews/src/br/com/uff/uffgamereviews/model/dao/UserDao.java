package br.com.uff.uffgamereviews.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.uff.uffgamereviews.connector.Connector;
import br.com.uff.uffgamereviews.model.User;

public class UserDao implements Dao<User> {
	
	@Override
	public void save(User user) {
		Connection con = Connector.getConnection();
		
		try {
			PreparedStatement st = con.prepareStatement("insert into user(email, senha) values(?, ?)");
			st.setString(1, user.getEmail());
			st.setString(2, user.getSenha());
			st.executeUpdate();

			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete(String username) {
		Connection con = Connector.getConnection();

		try {
			PreparedStatement st = con.prepareStatement("delete from user where username=?");
			st.setString(1, username);
			st.executeUpdate();	
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User getByEmail(String email) {		
		Connection con = Connector.getConnection();
		User usuario = null;

		try {
			PreparedStatement st = con.prepareStatement("select * from user where email=?");
			st.setString(1, email);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				usuario = new User();
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				
				con.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuario;	
	}
	
	public User getByUsername(String username) {		
		Connection con = Connector.getConnection();
		User usuario = null;

		try {
			PreparedStatement st = con.prepareStatement("select * from user where username = ?");
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				usuario = new User();
				usuario.setUsername(rs.getString("username"));
				usuario.setEmail("email");
				
				con.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuario;	

	}

	public List<User> getAll() {
		Connection con = Connector.getConnection();
		List<User> usuarios = new ArrayList<User>();

		try {
			PreparedStatement st = con.prepareStatement("select * from user");
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				User usuario = new User();
				usuario.setUsername(rs.getString("username"));
				usuario.setEmail("email");
				
				usuarios.add(usuario);
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;	
	}

	public User update(String email, User usuario) {

		Connection con = Connector.getConnection();
		
		try {
			PreparedStatement st = con.prepareStatement("update user set(username) values(?) where email = ?");
			
			st.setString(1, usuario.getUsername());
			st.executeUpdate();

			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public void resetPassword(User usuario) {
		Connection con = Connector.getConnection();
		PreparedStatement st;
		
		try {
			st = con.prepareStatement("update user set password = ? where email = ?");
			st.setString(2, usuario.getEmail());
			st.setString(1, usuario.getSenha());
			st.executeUpdate();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
