package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at GET: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeInseritoInPagina = request.getParameter("nomeParam");
		String cognomeInseritoInPagina = request.getParameter("cognomeParam");

		request.setAttribute("nomeAttr", nomeInseritoInPagina);
		request.setAttribute("cognomeAttr", cognomeInseritoInPagina);

		RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
		rd.forward(request, response);
	}

}
