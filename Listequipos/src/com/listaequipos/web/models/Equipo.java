package com.listaequipos.web.models;

import java.util.ArrayList;

public class Equipo {
	
	private int Id;
	private static int contador_equipo = 0;
	private String nombre_equipo;
	private ArrayList<Player> jugadores = new ArrayList<Player>();
	
	public Equipo()
	{
		this.Id = contador_equipo;
		contador_equipo++;
	}
	
	public void setJugador(Player jugador)
	{
		jugadores.add(jugador);
	}
	
	public ArrayList<Player> getJugadores()
	{
		return this.jugadores;
	}
	
	public void setNombreEquipo(String nombre)
	{
		this.nombre_equipo = nombre;
	}
	
	public String getNombreEquipo()
	{
		return this.nombre_equipo;
	}
	public int getId()
	{
		return this.Id;
	}
	
	public int cantidadJugadores()
	{
		int cantidad = 0;
		
		for(Player player: jugadores)
		{	
			cantidad++;
		}
		
		return cantidad;
	}
	
}
