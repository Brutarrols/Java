package com.mascotas.web.models;

public class Cat extends Animal implements Pet {

	public Cat()
	{
		
	}
	@Override
	public String showAffection() {
		String frase = "El gato te mira con desprecio y te ignora para lamerse la pata";
		return frase;
	}
}
