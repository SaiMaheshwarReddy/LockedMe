package com.lockedme.www;

import java.io.File;
import java.util.TreeSet;

public class Show_Files {
	void showAllFiles(String folder_path) {
	File myObj = new File(folder_path);
	
	String[] names =  myObj.list();
	TreeSet<String> mySet = new TreeSet<>();
	if(names.length < 1) {
		System.out.println("No files Exists exists or is not a directory");
		System.out.println("");
		
	} else {
		 for (String name : names) {
	         // Print the names of files and directories
	        mySet.add(name);
	     }
		 
		 for(String set : mySet) {
			 System.out.println(set);
			 
		 }
		 System.out.println("");
	}
	
}
}
