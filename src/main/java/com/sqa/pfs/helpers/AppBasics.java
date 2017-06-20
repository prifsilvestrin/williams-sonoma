package com.sqa.pfs.helpers;

import java.util.*;

public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Method to farewell user from the application.
	 */
	public static void farewellUser(String name) {
		System.out.println("Thanks for using this app. \nHave a great day " + name + "!");
	}

	/**
	 * @return
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " Application");
		System.out.print("Could I get your name please: ");
		return scanner.nextLine();
	}
}
