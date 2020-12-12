package com.greatnumber.web.models;

import java.util.Random;

public class NumeroAleatoreo {
	
	private Random r = new Random();
	private int numero;
	
	public NumeroAleatoreo()
	{
		this.numero = (int) r.nextInt(100)+ 1;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
}
