package com.cronometro.web.controllers;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cronometro.web.models.MemoryTime;
import com.cronometro.web.models.Records;

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
		LocalDateTime tiempo = LocalDateTime.now();
		MemoryTime tiempo_actual = new MemoryTime(tiempo.getHour(),tiempo.getMinute(),tiempo.getSecond()); 
		MemoryTime reserva_inicio = (MemoryTime) sesion.getAttribute("ultimo_tiempo_inicio");
		String comando = request.getParameter("comando");
		String ultimo_comando = (String) sesion.getAttribute("ultimo_comando");
		Records tiempos;
		
		if(sesion.getAttribute("tiempos") == null)
		{
			tiempos = new Records();
		}
		else
		{
			tiempos = (Records) sesion.getAttribute("tiempos");
		}
		
		
		if(comando == null || comando.equals("restart"))
		{
			comando = "";
			ultimo_comando = null;
		}
		
		switch(comando)
		{
			case "start":
				if(ultimo_comando == null || ultimo_comando.equals("stop"))
				{
					reserva_inicio = tiempo_actual;
				}
					ultimo_comando = comando;
				break;
			case "stop":				
				if(ultimo_comando.equals("start"))
				{
					tiempos.setRecordStarts(reserva_inicio);
					tiempos.setRecordFinish(tiempo_actual);
					tiempos.timeCurrentSeconds(reserva_inicio.totalSegundos(), tiempo_actual.totalSegundos());
					reserva_inicio = null;
					tiempo_actual = null;
				}
				ultimo_comando = comando;
				break;
			case "restart":
				if(tiempos != null)
				{
					tiempos.deleteTimes();
				}
				reserva_inicio = null;
				tiempo_actual =null;
				ultimo_comando = comando;
				break;
			default:
				if(ultimo_comando == null )
				{
					reserva_inicio = null;
					tiempo_actual = null;
				}
				break;
		}
		
		
		
		RequestDispatcher vista;
		request.setAttribute("tiempo_actual", tiempo_actual);
		sesion.setAttribute("ultimo_tiempo_inicio", reserva_inicio);
		sesion.setAttribute("ultimo_comando", ultimo_comando);
		sesion.setAttribute("tiempos", tiempos);
		vista = request.getRequestDispatcher("/WEB-INF/index.jsp");
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
