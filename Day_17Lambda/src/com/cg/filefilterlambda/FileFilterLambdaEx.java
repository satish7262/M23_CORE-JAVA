package com.cg.filefilterlambda;
import java.io.File;
import java.io.FileFilter;


public class FileFilterLambdaEx {
	public static void main(String[] args) {
		FileFilter obj=(File pathname) -> pathname.getName().endsWith(".txt");
		
		File file=new File(" \"C:\\Users\\sambhaji\\Downloads\\Telegram Desktop\"");
		
		File [] str=file.listFiles(obj);

		for(File i:str)
		{
			System.out.println(i);
		}
	}

}
