package com.mascotas.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mascotas.web.models.Cat;
import com.mascotas.web.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/perros")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog perro = new Dog();
		
		perro.setName(request.getParameter("name"));
		perro.setBreed(request.getParameter("breed"));
		perro.setWeight(Integer.parseInt(request.getParameter("weight")));
		
		request.setAttribute("perro", perro);
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/Dog.jsp");
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
