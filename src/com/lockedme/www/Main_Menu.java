package com.lockedme.www;

import java.io.File;
import java.util.Scanner;

public class Main_Menu {
	static String directory_path;
	void mainMenuMethod() {
		Scanner mainMenuScan = new Scanner(System.in);
		System.out.println("User Menu:");
		System.out.println("1. Show current file names in root diretory");
		System.out.println("2. Show options to Create, Delete, Search file");
		System.out.println("3. Exit App");
		System.out.println(" ");
		System.out.print("Please enter a directory path to continue: ");
		directory_path = mainMenuScan.nextLine();
		System.out.println("");
		
		File file = new File(directory_path);
		if(file.isDirectory()) {
			System.out.print("Choose any of the above options: ");
		
			
			int mainMenuOpt = mainMenuScan.nextInt();
			Show_Files showFiles = new Show_Files();
			
			Main_Menu mainMenu = new Main_Menu();
			
			switch(mainMenuOpt) {
			
			case 1 :
				showFiles.showAllFiles(directory_path);
				System.out.println("");
				mainMenu.mainMenuMethod();
				System.out.println("");
				break;
				
			case 2 :
				Sub_Menu subMenu = new Sub_Menu();
				subMenu.subMenuFnc(directory_path);
				System.out.println("");
				break;
			case 3 :
				System.out.println("You Exited the App");
				System.exit(0);
				break;
				
			default:
				System.out.print("Enter Valid Input: ");
				mainMenu.mainMenuMethod();
				System.out.println("");
				
			}
			mainMenuScan.close();
		} else {
			System.out.println("Incorrect directory path");
			Main_Menu mainMenu = new Main_Menu();
			mainMenu.mainMenuMethod();
		}
	
		
	}
	
}
