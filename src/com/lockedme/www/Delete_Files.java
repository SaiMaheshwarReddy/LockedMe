package com.lockedme.www;

import java.io.File;
import java.util.Scanner;

public class Delete_Files {
	 void deleteFileFnc(String folder_path) {
			Scanner deleteFileScan = new Scanner(System.in);
			System.out.println("");
			System.out.print("Enter file name that you want to delete: ");
		
			String deleteFileName = deleteFileScan.nextLine();
			
			File myObj = new File(folder_path + "\\"  + deleteFileName);
			if(myObj.delete()) {
				System.out.println("File deleted: " + myObj.getName());
				System.out.println("");
			} else {
				System.out.println("Unable to delete file");
				System.out.println("");
			}
			
		}
}
