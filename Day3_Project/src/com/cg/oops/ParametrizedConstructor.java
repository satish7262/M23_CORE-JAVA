package com.cg.oops;

class pulser
{
	
	int speed;
	String color;
	void Pulser(int speed,String color)
	{
		speed=50;
		color="white";
	}
	void accept()
	{
		
		System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	}
}

public class ParametrizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulser p=new Pulser(0, null);
		p.accept();

	}

}

