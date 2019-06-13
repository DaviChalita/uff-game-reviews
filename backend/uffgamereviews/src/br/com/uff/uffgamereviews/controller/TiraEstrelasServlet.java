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

/**
 * Servlet implementation class TiraEstrelasServlet
 */
@WebServlet("/tiraEstrela")
public class TiraEstrelasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDao();
		HttpSession sessao = request.getSession();
		
		sessao.setAttribute("usuario", dao.tiraEstrela((User)sessao.getAttribute("usuario")));
		response.sendRedirect("dashboard");
	}

}
