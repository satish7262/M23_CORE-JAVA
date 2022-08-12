package com.cg.polymorphism;

class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renauly-Kiger");
	}
	//Two parameter
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is:"+speed+"km/hr"+"AND THE ENGINE IS ON:"+engine);
		
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Engine");
		

	}

}
