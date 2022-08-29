package com.cg.enumpro;
interface piza
{
	void display();
}

enum size implements piza
{
	small ,medium ,large;

	@Override
	public void display() {
		System.out.println("size is:"+this);
		
	}
}

public class Example4 {
	public static void main(String[] args) {
		size.large.display();

	}
	

}
