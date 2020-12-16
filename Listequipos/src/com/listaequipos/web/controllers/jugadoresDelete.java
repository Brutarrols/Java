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
 * Servlet implementation class jugadoresDelete
 */
@WebServlet("/jugadoresDelete")
public class jugadoresDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jugadoresDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> lista_equipo = (ArrayList<Equipo>) sesion.getAttribute("equipos");
		int identificador_jugador = Integer.parseInt(request.getParameter("id"));
		int identificador_equipo = Integer.parseInt(request.getParameter("equipoId"));
		int contador = 0;
		
		for(Equipo equipo: lista_equipo)
		{
			if(equipo.getId() == identificador_equipo)
			{
				for(Player jugador : equipo.getJugadores())
				{	
					if(jugador.getId() == identificador_jugador)
					{
						equipo.getJugadores().remove(contador);
					}
					contador++;
				}
			}
			break;
		}
		
		sesion.setAttribute("equipos", lista_equipo);
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
