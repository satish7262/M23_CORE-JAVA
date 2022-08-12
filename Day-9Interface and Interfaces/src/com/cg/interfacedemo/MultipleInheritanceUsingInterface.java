package com.cg.interfacedemo;
interface Father
{
	void property();
	
}
interface Mother {
	void Love();
}
class Daughter implements Father,Mother {
	public void Love()
	{
		System.out.println("Mother Loves The Child");
	}
	public void property()
	{
		System.out.println("Father gives property to child");
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d=new Daughter ();
		d.Love();
		d.property();

	}

}
