package com.palabras.web.controllers;

import java.util.Date;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.palabras.web.models.Palabra;

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
		HttpSession session = request.getSession();
		
		Palabra palabras = new Palabra();
		String palabragenerada = palabras.generador();
		Date fecha  = new Date();
		int countgenerate = 0; 
		
		if("Generar".equals(request.getParameter("boton")))
		{
			countgenerate = Integer.parseInt(String.valueOf(session.getAttribute("countgenerate")));
			countgenerate++;
		}
		
		session.setAttribute("countgenerate", countgenerate);
		session.setAttribute("fecha", fecha);
		
		request.setAttribute("palabra", palabragenerada);
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/index.jsp");
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
