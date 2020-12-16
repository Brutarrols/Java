package com.listaequipos.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.listaequipos.web.models.Equipo;

/**
 * Servlet implementation class equipoDelete
 */
@WebServlet("/equipoDelete")
public class equipoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public equipoDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		int identificador = Integer.parseInt(request.getParameter("id"));
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> lista_equipos = (ArrayList<Equipo>) sesion.getAttribute("equipos");
		int posicion = 0;
		
		for(Equipo equipo: lista_equipos)
		{
			posicion++;
			if(equipo.getId() == identificador)
			{
				break;
			}
		}
		
		lista_equipos.remove(posicion);
		
		sesion.setAttribute("equipos", lista_equipos);
		RequestDispatcher vista = request.getRequestDispatcher("/WEB.INF/index.jsp");
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
