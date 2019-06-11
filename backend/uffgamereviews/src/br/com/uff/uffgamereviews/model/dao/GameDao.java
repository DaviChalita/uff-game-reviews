package br.com.uff.uffgamereviews.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.uff.uffgamereviews.conector.Conector;
import br.com.uff.uffgamereviews.model.Game;
import br.com.uff.uffgamereviews.model.User;

public class GameDao implements Dao<Game>{
	
	private static List<Game> jogos = new ArrayList<Game>();

	@Override
	public void save(Game jogo) {
		// TODO Auto-generated method stub
		Connection con = Conector.getConnection();
		PreparedStatement st;
		try {
			st = con.prepareStatement("insert into game values(null,?,?,?,?,?)");
			st.setInt(1, jogo.getNota());
			st.setString(2, jogo.getDescricao());
			st.setString(3, jogo.getNome());
			st.setString(4, jogo.getCapa());
			//pegar usuario que avaliou o jogo?
			st.executeUpdate();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int index) {
		Connection con = Conector.getConnection();
		PreparedStatement st;
		try {
			st = con.prepareStatement("delete from jogo where idJogo=?");
			st.setInt(1, index);
			st.executeUpdate();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lista() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Game get(String email) {/*CONTINUAR!!!!
		// TODO Auto-generated method stub
		Game game;
		Connection con = Conector.getConnection();
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("select where ");
			if(rs.next()) {
				game = new Game(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				return game;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}*/
		return null;
	}

}
