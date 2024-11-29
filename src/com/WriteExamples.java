package com;

import java.io.File;
import java.io.FileWriter;

public class WriteExamples {
	public static void main(String[] args) throws Exception{
		File f = new File("jspider.txt");
		FileWriter fw = new FileWriter(f,true); //true-->false
		fw.write("learning file handling");
		fw.flush();
		fw.close();
		System.out.println("data stored....");
	}

}
