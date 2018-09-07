package com.project.paulascars;

import java.util.Scanner;

public class Controller {
	
	//public enum query {add, amend, remove, view, search};
	private static String add = "add";
	private static String amend = "amend";
	private static String remove = "remove";
	private static String view = "view";
	private static String search = "search";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Paulas Cars!");
		System.out.println("What ");
		runQuery(scanner, scanner.next());
	}
	public static void runQuery(Scanner scanner, String query){
		if (query.equals(add)){
			System.out.println("Enter in the following format, separated by a space: ");
			System.out.println("make - model - registration number - fuel - vehicle type");
			String make = scanner.next();
			String model = scanner.next();
			int reg = scanner.nextInt();
			String fuel = scanner.next();
			String vehicle = scanner.next();
			add(make, model, reg, fuel, vehicle);
		}
		if (query.equals(amend)){
			System.out.println("Enter the registration number of the car to amend: ");
			int reg = scanner.nextInt();
			System.out.println("What do you want to amend for reg number " + reg);
			System.out.println("make - model - registration number - fuel - vehicle type");
			amend(scanner.next());
		}
		if (query.equals(remove)){
			System.out.println("Enter the registration number of the car to remove: ");
			remove(scanner.next());
		}
		if (query.equals(view)){
			view();
		}
		if (query.equals(search)){
			System.out.println(" What do you want to search for? ");
			System.out.println(" model - fueltype - price");
			String searchItem = scanner.next();
			
			find(searchItem);
		}
		else{
			System.out.println("Oops! Incorrect query");
		}
	}

}
