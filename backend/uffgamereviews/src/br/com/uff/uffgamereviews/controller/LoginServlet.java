package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		if (req.getParameter("erro") != null) {
			req.setAttribute("erro", "Email ou senha incorretos");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, res);
	}
}
