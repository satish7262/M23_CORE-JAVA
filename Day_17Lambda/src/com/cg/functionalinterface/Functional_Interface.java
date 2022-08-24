package com.cg.functionalinterface;
interface A
{
	void show();
	
}
class B implements A
{

	@Override
	public void show() {
		System.out.println("Funcational program on implements funcation interface using lambda");
		
	}
	
}


public class Functional_Interface {
	public static void main(String[] args) {
		//B b=new B();
			//b.show();
		A obj=() ->
		{
			System.out.println("Funcational program on implements funcation interface using lambda");
		};
		obj.show();
		}


}
