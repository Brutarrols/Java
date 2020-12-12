package com.greatnumber.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.greatnumber.web.models.NumeroAleatoreo;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		NumeroAleatoreo ramdom = new NumeroAleatoreo();
		
		sesion.setAttribute("numero", ramdom.getNumero());
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		int numero = (int) sesion.getAttribute("numero");
		int adivina = Integer.parseInt(request.getParameter("adivina"));
		RequestDispatcher view ;
		
		if(numero > adivina)
		{
			view = request.getRequestDispatcher("/WEB-INF/alto.jsp");
			view.forward(request, response);
		}
		if(numero < adivina)
		{
			view = request.getRequestDispatcher("/WEB-INF/bajo.jsp");
			view.forward(request, response);
		}
		if(numero == adivina)
		{
			view = request.getRequestDispatcher("/WEB-INF/gana.jsp");
			view.forward(request, response);
		}
	}
}
