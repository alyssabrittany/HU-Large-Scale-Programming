package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	@Override
	public void move() {
		System.out.println("This Goose moves forward.");
	}
	
	@Override
	public void speak() {
		System.out.println("This Goose speaks.");
	}

	@Override
	public void flying() {
		System.out.println("The Goose is flying.");
		
	}
}
