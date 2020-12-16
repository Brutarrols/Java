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
 * Servlet implementation class equipo
 */
@WebServlet("/equipo")
public class equipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public equipo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> lista_objetos = (ArrayList<Equipo>) sesion.getAttribute("equipos");
		
		RequestDispatcher vista;
		
		if(request.getParameter("id") == null)
		{
			vista = request.getRequestDispatcher("WEB-INF/newEquipo.jsp");
			vista.forward(request, response);
		}
		else 
		{			
			int identificador = Integer.parseInt(request.getParameter("id"));
			Equipo view_equipo = new Equipo();
			
			for(Equipo equipo: lista_objetos)
			{
				if(equipo.getId() == identificador)
				{
					view_equipo = equipo;
				}
			}
			
			request.setAttribute("Equipo", view_equipo);
			
			vista = request.getRequestDispatcher("WEB-INF/detallesEquipo.jsp");
			vista.forward(request, response);
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		Equipo nuevo_equipo = new Equipo();
		ArrayList<Equipo> lista_equipos = new ArrayList<Equipo>();
		lista_equipos = (ArrayList<Equipo>) sesion.getAttribute("equipos");
		
		nuevo_equipo.setNombreEquipo(request.getParameter("nombre_equipo"));
		
		lista_equipos.add(nuevo_equipo);
		
		sesion.setAttribute("equipos", lista_equipos);
		
		RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/index.jsp");
		vista.forward(request, response);
		
	}

}
