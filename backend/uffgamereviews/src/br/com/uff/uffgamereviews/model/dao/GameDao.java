package br.com.uff.uffgamereviews.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.uff.uffgamereviews.conector.Conector;
import br.com.uff.uffgamereviews.model.Game;
import br.com.uff.uffgamereviews.model.User;

public class GameDao implements Dao<Game>{
	
	@Override
	public void save(Game jogo) {
		// TODO Auto-generated method stub
		Connection con = Conector.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("insert into jogo(rated_username, nota) values(?, ?)");
			st.setString(1, jogo.getOwner().getUsername());
			st.setInt(2, jogo.getNota());
			st.executeUpdate();

			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void delete(int index) {
		Connection con = Conector.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("delete from jogo where idJogo=?");
			st.setInt(1, index);
			st.executeUpdate();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void update(int index, Game jogo) {
		Connection con = Conector.getConnection();
		
		try {
			PreparedStatement st1 = con.prepareStatement("delete from jogo where idJogo=?");
			st1.setInt(1, index);
			st1.executeUpdate();
			
			PreparedStatement st = con.prepareStatement("insert into jogo(rated_username, nota) values(?, ?)");
			st.setString(1, jogo.getOwner().getUsername());
			st.setInt(2, jogo.getNota());
			st.executeUpdate();

			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void lista() {
		// TODO Auto-generated method stub
		
	}
	
	public Game get(int index) {		
		Connection con = Conector.getConnection();
		UserDao userDao = new UserDao();
		Game jogo = null;

		try {
			PreparedStatement st = con.prepareStatement("select * from jogo where idJogo=?");
			st.setInt(1, index);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				User user = new User();
				user = userDao.getByUsername(rs.getString("rated_username"));
				
				jogo = new Game();
				jogo.setIdJogo(rs.getInt("idJogo"));
				jogo.setOwner(user);
				jogo.setNota(rs.getInt("nota"));
				con.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jogo;	
	}

	public List<Game> getAll() {
		Connection con = Conector.getConnection();
		UserDao userDao = new UserDao();
		List<Game> jogos = new ArrayList<Game>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from jogo");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				User user = new User();
				user = userDao.getByUsername(rs.getString("user_username"));
				
				Game jogo = new Game();
				jogo.setIdJogo(rs.getInt("idJogo"));
				jogo.setOwner(user);
				jogo.setNota(rs.getInt("nota"));
				jogos.add(jogo);
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jogos;	
	}
	
}
