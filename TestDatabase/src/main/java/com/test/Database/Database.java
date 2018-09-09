package com.test.Database;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private HashMap<Integer, Vehicle> map = new HashMap<Integer, Vehicle>();

    @Override
    public String toString() {
        return "Database{" +
                "vehicles=" + vehicles +
                '}';
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        map.put(vehicle.getRegistrationNumber(), vehicle);
    }
    public void removeVehicle(int reg){
        vehicles.remove(map.get(reg));
    }
    public void amendVehicle(String field, int reg, String newValue){
        Vehicle vehicle = map.get(reg);
        removeVehicle(reg);
        if (field.equals("make") || (field.equals("Make"))){
            vehicle.setMake(newValue);
        }
        if (field.equals("model") || (field.equals("Model"))){
            vehicle.setModel(newValue);
        }
        if (field.equals("type") || (field.equals("Type"))){
            vehicle.setType(newValue);
        }
        addVehicle(vehicle);
    }
    public void findVehicle(int reg){
        Vehicle vehicle = map.get(reg);
        if (vehicle == null){
            System.out.println("No vehicle with that registration number exists");
        }
        else{
            System.out.println(vehicle.toString());
        }
    }
    public boolean vehicleExists(int reg){
        return map.containsKey(reg);
    }

    public void display(){
        if (vehicles.size() == 0){
            System.out.println("The database is currently empty");
        }
        else{
            for (int i = 0; i < vehicles.size(); i++){
                System.out.println(vehicles.get(i).toString());
            }
        }
    }
}
