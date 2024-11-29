package com;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		
		//object representation of a file name or folder name.
		//since path is not specified folder gets created within project itself.
		//File f = new File("car");
		//folder gets created within D drive.
		File f = new File("car");
		boolean result= f.mkdir();
		System.out.println(result);//System.out.println(f.mkdir());
	}

}
