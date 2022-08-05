package com.cg.inheritance;
import com.cg.inheritance.Bike.Pulser;
import com.cg.inheritance.Bike.Pulser125;

//program of multilevel inheritance
//parent claass 1
class Bike{
	protected int speed;
	void display() {
		System.out.println(" i like to drive a bike");
		
	}
	// parent class for pulser as well as child
class Pulser extends Bike{
	protected String color;
	void print()
	{
		System.out.println("Speed is:"+ speed);
	}
}
class Pulser125 extends Pulser {
	void accept()
	{
		System.out.println("Color is: "+ color);
	}
}
public class MultiLevelInheritance{
	
}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pulser125 s = new Pulser125();
		s.color="Black";
		s.speed=80;
		s.accept();
		s.display();
		s.print();

	}

}
