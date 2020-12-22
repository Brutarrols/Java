package com.calculadora.web.models;

import java.util.ArrayList;

public class Historial {
	private ArrayList<String> historial = new ArrayList<String>();
	
	public Historial()
	{
		
	}
	
	public void setHistorial(String cadena)
	{
		historial.add(cadena);
	}
	
	public ArrayList<String> getHistorial()
	{
		return historial;
	}
}
