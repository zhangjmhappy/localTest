package com.zjm.java8;

import java.io.File;

public class Test01 {
	
	public static void main(String[] args) {
		File[] hiddenFiles = new File("C:\\Users\\Default").listFiles(File::isHidden);
		
		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
		
	}

}
