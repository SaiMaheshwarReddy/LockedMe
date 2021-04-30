package com.lockedme.www;

public class Welcome_Page {

	public static void main(String[] args) {
		System.out.print("App Name: LockedMe");
		System.out.println("       Developer Name: G Sai Maheshwar Reddy");
		System.out.println("");
		
		Main_Menu mainMenu = new Main_Menu();
		mainMenu.mainMenuMethod();

	}

}
