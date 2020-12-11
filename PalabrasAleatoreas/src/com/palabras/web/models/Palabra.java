package com.palabras.web.models;

import java.util.Random;

public class Palabra {
	
	public String generador()
	{
		 String cadena = "";
	        Random rm = new Random();
	        int caster ;

	        for(int i = 0 ; i < 10; i++)
	        {
	            caster = 97+ (int) rm.nextInt((122+1)-97);
	            cadena +=  ((char) caster);
	        }

	        return cadena;
	}
}
