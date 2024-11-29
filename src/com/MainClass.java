package com;

import java.io.File;

public class MainClass {
	public static void main(String[] args) {
		File f = new File("car");
		if(f.exists()) {
			f.delete();
			System.out.println("file/folder deleted");
		}
		else {
			System.out.println("file/folder not present");
		}
	}

}
