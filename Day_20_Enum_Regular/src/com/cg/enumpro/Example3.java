package com.cg.enumpro;

public class Example3 {
	enum bike
	{
		palser,KTM,R3;
	}
	public static void main(String[] args) {
		bike b=bike.KTM;
		
		switch(b)
		{
		case palser:
			System.out.print("we use palser");
			break;
			
		case KTM:
			System.out.print("we use KTM");
			break;
			
		case R3:
			System.out.print("we use R3");
			break;
			
			default:
				System.out.println("Invalid");
		}

	}

}
