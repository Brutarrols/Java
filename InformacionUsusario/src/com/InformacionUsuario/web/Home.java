package com.InformacionUsuario.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String language = request.getParameter("favoriteLanguage");
		String city = request.getParameter("homeTown");
		
		if(firstname == null)
		{
			firstname = "Unknow";
		}
		if(lastname == null)
		{
			lastname = "Unknow";
		}
		if(language == null)
		{
			language = "Unknow";
		}
		if(city == null)
		{
			city = "Unknow";
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<h1> Welcome, "+ firstname +" "+lastname+"</h1>"+
				  "<p>Your favorite language is: "  +language+ "</p>"+
				  "<p>Your home Town is: "+city+"</p>" );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
