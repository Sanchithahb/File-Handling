package com;

import java.io.File;
import java.io.FileWriter;

public class WriterDemo {
	public static void main(String[] args) throws Exception{
		File f = new File("emp.txt");
		FileWriter fw = new FileWriter(f); //Unhandled exception type IOException
		fw.write("good morning");
		fw.flush();
		fw.close();
		System.out.println("data stored");
	}
	
	

}
