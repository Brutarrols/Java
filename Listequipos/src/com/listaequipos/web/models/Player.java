package com.listaequipos.web.models;

public class Player {
	
	private int Id;
	private static int contador_jugador = 0;
	private String first_name, last_name;
	private int age;
	
	public Player()
	{
		this.Id = contador_jugador;
		contador_jugador++;
	}
	
	public void setFirstName(String name)
	{
		this.first_name = name;
	}
	public void setLastName(String name)
	{
		this.last_name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getFirstName()
	{
		return this.first_name;
	}
	public String getLastName()
	{
		return this.last_name;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getId()
	{
		return this.Id;
	}
	
	
}

