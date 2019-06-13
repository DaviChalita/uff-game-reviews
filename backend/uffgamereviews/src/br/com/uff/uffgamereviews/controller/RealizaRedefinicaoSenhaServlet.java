package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.uff.uffgamereviews.model.User;
import br.com.uff.uffgamereviews.model.dao.UserDao;

@WebServlet("/realizaRedefinicaoSenha")
public class RealizaRedefinicaoSenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDao = new UserDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		User usuario = new User();
		
		usuario.setEmail(req.getParameter("email"));
		usuario.setSenha(req.getParameter("novaSenha"));
		
		if (userDao.getByEmail(usuario.getEmail()) == null) {
			res.sendRedirect("redefine-senha?err=usuario-nao-encontrado");	
			return;
		}
		
		userDao.resetSenha(usuario);
		res.sendRedirect("login");
	}
}
