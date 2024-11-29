package com;

import java.io.File;
import java.io.FileReader;

public class Readexamples {
	public static void main(String[] args)  throws Exception{
		File f = new File("jspider.txt");
		FileReader fr = new FileReader(f ); //Unhandled exception type FileNotFoundException
		 int  x= fr.read();
		 while(x != -1) {
			 System.out.println((char)x);
			 x=fr.read();
			 
		 }
		 fr.close();
		 
	}

}
