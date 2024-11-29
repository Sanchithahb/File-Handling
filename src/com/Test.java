package com;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		//File f = new File("Student");
		//System.out.println(f.mkdir());//-->true
		
		
		File f = new File("d:/Student.txt");//.doc , .pdf etc
		try {
		System.out.println(f.createNewFile());//Unhandled exception type IOException
		}
		catch(Exception e) {
			System.out.println("handled");
		}
	}

}
