package com.lockedme.www;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create_Files {
void createFilesFnc(String folder_path) {
	Scanner createFileScan = new Scanner(System.in);
	System.out.println("");
	System.out.print("Enter name of the file that you want to create: ");

	String createFileName = createFileScan.nextLine();
File myObj = new File(folder_path + "\\" + createFileName);
try {
if(myObj.createNewFile()) {

	System.out.println("New File Created: " + myObj.getName());
	System.out.println("");
} else {
	System.out.println("Failed To Create File: " + myObj.getName());
	System.out.println("");
}
}
catch(IOException e){
	System.out.println("An Error Occured");
	e.printStackTrace();
}

}
}
