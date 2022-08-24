package com.cg.oneparameterfunctionalinterface;
interface c
{
	String print(String str);
}

public class OneParameterFunctionInterface {
	public static void main(String[] args) {
		c obj=(String str) ->
		{
			
			return str;
		};
		System.out.println(obj.print("sam"));

	}

}

