package com.mascotas.web.models;

public class Dog extends Animal implements Pet {

	@Override
	public String showAffection()
	{
		
		if(getWeight() < 30)
		{
			return "El perro salta sobre ti para que lo abarazes";
		}
		else
		{
			return "El perro mira al horizonte con la cabeza ergida y las orjas levantas (¡ARDILLA!)";
		}
	}
}
