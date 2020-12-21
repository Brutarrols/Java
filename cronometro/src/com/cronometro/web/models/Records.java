package com.cronometro.web.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Records {

	ArrayList<MemoryTime> records_start = new ArrayList<MemoryTime>();
	ArrayList<MemoryTime> records_finish = new ArrayList<MemoryTime>();
	ArrayList<MemoryTime> total_time = new ArrayList<MemoryTime>();
	
	
	public Records()
	{
		
	}
	
	public void setRecordStarts(MemoryTime tiempo)
	{
		records_start.add(tiempo);
	}
	
	public ArrayList<MemoryTime> getRecordStart()
	{
		return this.records_start;
	}
	
	public void setRecordFinish(MemoryTime tiempo)
	{
		this.records_finish.add(tiempo);
	}
	
	public ArrayList<MemoryTime> getRecordFinish()
	{
		return this.records_finish;
	}
	
	public ArrayList<MemoryTime> getTotalRecord()
	{
		return this.total_time;
	}
	
	public void deleteTimes()
	{
		records_start.removeAll(records_start);
		records_finish.removeAll(records_finish);
	}
	
	public void timeCurrentSeconds(int inicio, int termino)
	{
		//Iterator<MemoryTime> index = records_start.iterator();
		//Iterator<MemoryTime> index2 = records_finish.iterator();
		int diferencia,horas,minutos,segundos ;
		
		diferencia = termino - inicio;
		minutos = diferencia /60;
		horas = minutos /60;
		segundos = diferencia % 60;
			
		MemoryTime total_tiempo = new MemoryTime( horas,minutos,segundos );
			
		total_time.add(total_tiempo);
		
	}
}
