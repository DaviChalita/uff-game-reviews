package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.uff.uffgamereviews.model.User;
import br.com.uff.uffgamereviews.model.dao.UserLogin;

@WebServlet("/realizaLogin")
public class RealizaLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL_BASE = "/uffgamereviews";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		User usuario = new User();
		usuario = UserLogin.Login(email, senha);
		
		if (usuario != null) {
			HttpSession sessao = req.getSession(true);
			sessao.setAttribute("username", usuario);
			
			res.sendRedirect(URL_BASE + "/dashboard");
		}
		
		else {
			res.sendRedirect(URL_BASE + "/login?err=algo-de-errado-nao-esta-certo");
		}
		
	}
}
