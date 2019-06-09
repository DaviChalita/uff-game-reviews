package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/cadastro")
public class CadastraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		RequestDispatcher rd = req.getRequestDispatcher("/cadastro.jsp");
		rd.forward(req, res);
		
	}
}
