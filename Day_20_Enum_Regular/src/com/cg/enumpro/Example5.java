package com.cg.enumpro;

public class Example5 {
	enum emp
	{
		contract ,temporary ,permanent;
	}
	
	static void print(emp e)
	{
		if(e==emp.permanent)
		{
			System.out.println("emp type is permanent");
		}else if(e==emp.contract)
		{
			System.out.println("emp type is contract");
		}
		else
		{
			System.out.println("emp type is temporary");
		}
	}

	public static void main(String[] args) {
		emp e=emp.permanent;
		print(e);

	}

}
