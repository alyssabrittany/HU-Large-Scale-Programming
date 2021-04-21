package org.howard.edu.lsp.exam.question40;



class Question40 {
	
	public static void main(String[] args) {
		Flying f1 = new Airplane();
		Flying f2 = new Goose();
		
		Animal a1 = new Tiger();
		Animal a2 = new Goose();
		
		f1.flying();
		f2.flying();
		
		
		
		a1.move();
		a2.move();
		
		a1.speak();
		a2.speak();
		
		
	}
}
