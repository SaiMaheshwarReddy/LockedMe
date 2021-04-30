package com.lockedme.www;

import java.io.File;
import java.util.Scanner;

public class Find_Files {
	void searchFiles(String folder_path) {
		Scanner searchScan = new Scanner(System.in);
		System.out.print("Enter file name to search: ");
		String searchFileName = searchScan.nextLine();
		File searchObj = new File(folder_path + "\\" + searchFileName);
		
//		File[] filesList =  searchObj.listFiles();
	
		
			if(searchObj.exists()) {
				System.out.println("Found the file: " + searchFileName);
				System.out.println("");
			} else {
				System.out.println("File Not Found");
			}
			
		}
		 
		 
	}

