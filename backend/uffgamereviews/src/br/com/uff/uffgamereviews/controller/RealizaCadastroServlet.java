package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.uff.uffgamereviews.model.User;
import br.com.uff.uffgamereviews.model.dao.UserDao;

@WebServlet("/realizaCadastro")
public class RealizaCadastroServlet extends HttpServlet {
	UserDao userDao = new UserDao();
	User usuario = new User();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		usuario.setUsername(req.getParameter("username")); 
		usuario.setEmail(req.getParameter("email"));
		usuario.setPassword(req.getParameter("senha"));
		
		userDao.save(usuario);
		
		req.setAttribute("username", usuario.getUsername());
		req.setAttribute("email", usuario.getEmail());
		req.setAttribute("senha", usuario.getPassword());
		
		RequestDispatcher rd = req.getRequestDispatcher(
			"/realizaCadastro.jsp?usuario="
			+ "&username=" + usuario.getUsername()
			+ "&email=" + usuario.getEmail()
			+ "&senha=" + usuario.getPassword()
		);
		
		rd.forward(req, res);
	}
}
