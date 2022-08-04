package com.cg.package4;
import com.cg.package3.HDFC;
public class EncapsulationHDFC {
	public static void main(String[]args) {
		HDFC h=new HDFC();
		h.setAmount(56000);
		System.out.println("The amount is my bank is "+h.getAmount());
		
	}
	

}
