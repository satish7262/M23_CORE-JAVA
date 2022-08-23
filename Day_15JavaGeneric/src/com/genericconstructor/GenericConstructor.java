package com.genericconstructor;

public class GenericConstructor<T1 ,T2> 
{
	T1 var1;
	T2 var2;
	
	Generic_constructor(T1 var1 ,T2 var2)
	{
		 this.var1=var1;
		 this.var2=var2;
	}
	
	void  display()
	{
		System.out.println(var1);
		System.out.println(var2);
		
	}
	public static void main(String[] args) 
	{
		Generic_constructor<Integer ,String> gc=new Generic_constructor<Integer ,String> (12,"Sambhaji");
		gc.display();
	}

	

}
