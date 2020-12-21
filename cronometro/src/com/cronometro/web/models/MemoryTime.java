package com.cronometro.web.models;

public class MemoryTime {
	private int hora;
	private int minutos;
	private int segundos;
	
	public MemoryTime(int hora, int minutos, int segundos)
	{
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public MemoryTime()
	{
		
	}
	
	public int getHora()
	{
		return this.hora;
	}
	public int getMinutos()
	{
		return this.minutos;
	}
	public int getSegundos()
	{
		return this.segundos;
	}
	
	public int totalSegundos()
	{
		int horas_a_minutos = this.hora * 60;
		int minutos_a_segundos =  (this.minutos + horas_a_minutos) * 60 ;
		
		return minutos_a_segundos + this.segundos;
		
	}
}
