package com.calculadora.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.calculadora.web.models.Calculator;
import com.calculadora.web.models.Historial;

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
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/index.jsp");
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		Calculator calculador = new Calculator();
		Historial historial ;
		String operacion = request.getParameter("operacion");
		operacion = operacion + "=";
		String numero = "";
		
		
		if(sesion.getAttribute("historial") == null)
		{
			historial = new Historial();
		}
		else
		{
			historial = (Historial) sesion.getAttribute("historial");
		}
			
		char[] arreglo = operacion.toCharArray();
		
		
		for(int i = 0; i < arreglo.length; i++)
		{
			if(arreglo[i] == '+' || arreglo[i] == '-' || arreglo[i] == '*' || arreglo[i] == '/' || arreglo[i] == '=')
			{
				calculador.performOperation(Integer.parseInt(numero));
				calculador.performOperation(arreglo[i]);
				numero = "";
			}
			else
			{
				numero = numero + arreglo[i];
			}
		}
		String resultado = Integer.toString(calculador.getResults());
		
		historial.setHistorial(operacion + resultado);
	
		sesion.setAttribute("historial", historial);
		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/index.jsp");
		vista.forward(request, response);
	}

}
