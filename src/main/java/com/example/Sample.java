package com.example;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imp i1 = new Imp("Mamatha", 6);
		i1.display();	
	}

}
class Imp{
	private String name;
	private int sem;
	Imp(String name,int sem){
		this.name=name;
		this.sem=sem;
	}
	public void display() {
		System.out.println(name);
		System.out.println(sem);
	}
}
