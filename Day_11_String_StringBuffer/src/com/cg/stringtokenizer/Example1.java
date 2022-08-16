package com.cg.stringtokenizer;

import java.util.StringTokenizer;
public class Example1 {

		public static void main(String[] args) {
			StringTokenizer s=new StringTokenizer("JAVA:Code:String", ":",true);
			
			while(s.hasMoreElements())
			{
				System.out.println(s.nextToken());
			}

		}


}
