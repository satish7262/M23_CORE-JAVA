package com.cg.twoparameterfunctionalinterface;
interface D
{
	int show(int a,int x);
}

public class TwoParameriedFunctionalInterface {
	public static void main(String[] args) {

		D obj=(int a,int d)->
		{
			return a+d;
		};
		System.out.println(obj.show(12,34));

	}

}
