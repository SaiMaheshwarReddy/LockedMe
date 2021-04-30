package com.lockedme.www;

import java.util.Scanner;

public class Sub_Menu {
void subMenuFnc(String folder_path) {
	System.out.println("Welcome to file manager");
	System.out.println("1. Create a file in existing directory");
	System.out.println("2. Delete a file from existing directory");
	System.out.println("3. Search for a file from existing directory");
	System.out.println("4. Go back to main menu");
	Scanner subMenuScan = new Scanner(System.in);
	System.out.print("Enter a Valid Option: ");
	int subMenuOpt = 0;
	subMenuOpt = subMenuScan.nextInt();
	Sub_Menu subMenu = new Sub_Menu();
	switch(subMenuOpt) {
	case 1 :
		Create_Files createFile = new Create_Files();
		createFile.createFilesFnc(folder_path);
		subMenu.subMenuFnc(folder_path); 
		System.out.println("");
		break;
	case 2 :
		Delete_Files deleteFile = new Delete_Files();
		deleteFile.deleteFileFnc(folder_path);
		subMenu.subMenuFnc(folder_path);
		System.out.println("");
		break;
	case 3 :
		Find_Files findFile = new Find_Files();
		findFile.searchFiles(folder_path);
		subMenu.subMenuFnc(Main_Menu.directory_path);
		System.out.println("");
		break;
	case 4 :
		Main_Menu mainMenu = new Main_Menu();
		mainMenu.mainMenuMethod();
		System.out.println("");
		break;
	}
	
}
}
