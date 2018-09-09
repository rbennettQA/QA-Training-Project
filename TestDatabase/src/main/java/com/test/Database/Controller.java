package com.test.Database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private Database database = new Database();

    public static void main(String[] args) {
        System.out.println("Welcome to the database!");
        Controller controller = new Controller();
        controller.begin();
    }
    public void begin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation do you want to perform?");
        System.out.println(" - ADD - REMOVE - VIEW - AMEND - SEARCH - EXIT - ");
        String query = scanner.nextLine();
        validateInput(query);
        executeQuery(scanner, query);
    }
    public void executeQuery(Scanner scanner, String query){
        if (query.equals("ADD")) {
            addVehicle(scanner);
        }
        if (query.equals("REMOVE")) {
            removeVehicle(scanner);
        }
        if (query.equals("VIEW")) {
            viewDatabase();
        }
        if (query.equals("AMEND")) {
            amendVehicle(scanner);
        }
        if (query.equals("SEARCH")) {
            findVehicle(scanner);
        }
        if (query.equals("EXIT")) {
            scanner.close();
        }
        else{
            System.out.println("Invalid query, try again");
            begin();
        }
    }
    public void viewDatabase(){
        database.display();
        begin();
    }
    public void addVehicle(Scanner scanner) {
        System.out.println("What type of vehicle do you want to add?");
        String type = scanner.nextLine();
        validateInput(type);
        System.out.println("Enter the following information");
        System.out.println("- Number of Wheels - Registration Number - Make - Model -");
        try{
            int wheels = scanner.nextInt();
            int reg = scanner.nextInt();
            String make = scanner.next();
            String model = scanner.next();
            Vehicle vehicle = new Vehicle(type, wheels, reg, make, model);
            if (database.vehicleExists(reg)) {
                System.out.println("Invalid input, a vehicle with that registration number already exists");
            }
            else{
                database.addVehicle(vehicle);
                System.out.println(vehicle + " added");
            }
        }
        catch (InputMismatchException error){
            System.out.println("Invalid input");
        }
        begin();
    }
    public void removeVehicle(Scanner scanner){
        System.out.println("Enter the registration number of the vehicle you want to remove");
        int reg = scanner.nextInt();
        database.removeVehicle(reg);
        System.out.println("Vehicle with registration number " + reg + " was succesfully removed");
        begin();
    }
    public void amendVehicle(Scanner scanner){
        System.out.println("Enter the registration number of the vehicle you want to amend");
        int reg = scanner.nextInt();
        database.removeVehicle(reg);
        System.out.println("What value would you like to change?");
        String field = scanner.next();
        System.out.println("What do you want to change it to?");
        database.amendVehicle(field, reg, scanner.next());
        System.out.println("Vehicle with registration number " + reg + " was succesfully amended");
        begin();
    }
    public void findVehicle(Scanner scanner){
        System.out.println("Enter the registration number of the vehicle you want to find");
        int reg = scanner.nextInt();
        database.findVehicle(reg);
        begin();
    }
    public void validateInput(String string){
        if (string.contains(" ")){
            System.out.println("Invalid choice, try again");
            begin();
        }
    }
}
