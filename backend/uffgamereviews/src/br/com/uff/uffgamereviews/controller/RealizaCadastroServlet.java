package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.uff.uffgamereviews.model.User;
import br.com.uff.uffgamereviews.model.dao.UserDao;

@WebServlet("/realizaCadastro")
public class RealizaCadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDao userDao = new UserDao();
	User usuario = new User();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		usuario.setUsername(req.getParameter("username")); 
		usuario.setEmail(req.getParameter("email"));
		usuario.setSenha(req.getParameter("senha"));
		
		userDao.save(usuario);
		
		HttpSession sessao = req.getSession(true);
		
		sessao.setAttribute("username", usuario.getUsername());
		sessao.setAttribute("email", usuario.getEmail());

		res.sendRedirect("dashboard");
		
	}
}
