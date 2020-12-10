package com.mascotas.web.models;

public class Animal {
	
	private String name, breed;
	private int weight;
	
	public Animal()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getBreed()
	{
		return this.breed;
	}
	public int getWeight()
	{
		return this.weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}
