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
import com.listaequipos.web.models.Player;

/**
 * Servlet implementation class jugadores
 */
@WebServlet("/jugadores")
public class jugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jugadores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		int id_equipo = Integer.parseInt(request.getParameter("id"));
		
		sesion.setAttribute("Id_equipo", id_equipo);
		
		RequestDispatcher vista =  request.getRequestDispatcher("/WEB-INF/crearJugador.jsp");
		vista.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		int identificador = Integer.parseInt(String.valueOf(sesion.getAttribute("Id_equipo")));
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> equipos = (ArrayList<Equipo>) sesion.getAttribute("equipos");
		
		Player nuevo_jugador = new Player();
		Equipo nuevo_equipo = new Equipo();
		
		nuevo_jugador.setFirstName(request.getParameter("nombre"));
		nuevo_jugador.setLastName(request.getParameter("apellido"));
		nuevo_jugador.setAge(Integer.parseInt(request.getParameter("edad")));
		
		for(Equipo equipo : equipos)
		{
			if(equipo.getId() == identificador)
			{
				nuevo_equipo = equipo;
				equipo.setJugador(nuevo_jugador);
			}
		}
		
		request.setAttribute("Equipo", nuevo_equipo);
		sesion.setAttribute("equipos", equipos);
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/index.jsp");
		vista.forward(request, response);
		
		
	}

}
