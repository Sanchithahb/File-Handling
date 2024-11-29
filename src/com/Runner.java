package com;

import java.io.File;

public class Runner {
	public static void main(String[] args) {
		File f1 = new File("d:/Student.txt");
		File f2 = new File("d:/Employee.txt");
		System.out.println(f1.renameTo(f2));
	}

}
