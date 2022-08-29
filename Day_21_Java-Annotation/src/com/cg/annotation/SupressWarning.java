package com.cg.annotation;
import java.util.Scanner;

class Animal
{
	
	Animal()
	{
		System.out.println("Lion");
	}
	
	void sound()
	{
		System.out.println("bor bor");
	}
}


public class SupressWarning {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a=new Animal();
		

	}

}
