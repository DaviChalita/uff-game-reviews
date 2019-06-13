package br.com.uff.uffgamereviews.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.uff.uffgamereviews.model.User;
import br.com.uff.uffgamereviews.model.dao.GameDao;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL_BASE = "/uffgamereviews";
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession sessao = req.getSession();
		
		GameDao dao = new GameDao();

		User usuario = (User) sessao.getAttribute("usuario");
		
		if (usuario != null) {
			req.setAttribute("jogos", dao.getAll());

			RequestDispatcher rd = req.getRequestDispatcher("/dashboard.jsp");
			rd.forward(req, res);
		}
		
		else {
			res.sendRedirect(URL_BASE + "/index");
		}
	}
}
