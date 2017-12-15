package com.coderbd.day1;

/**
 *
 * @author ANDROID
 */
//Here Building is a class Name
public class Building {

    //instance /class level variable
    //variable declaration is complete here

    private String name;
    private String location;

//here Building() is a Constructor
    //Without parameter, it is called default constructor
    public Building() {
    }

    public Building(String n) {
        name = n;
    }

    public Building(String name, String location) {
        this.name = name;
        this.location = location;
    }
 public static void main(String[] args) {
        Building building1 = new Building("Ekushe Bhabon", "Mirpur");
        System.out.println("Building1 Name: " + building1.getName() + ", Location: " + building1.getLocation());

        Building building2 = new Building("Gono Bhabon", "College Gate");
        System.out.println("Building2 Name: " + building2.getName() + ", Location: " + building2.getLocation());

        Building building3 = new Building();
        building3.setName("Prime Minster Office Bhabon");
        building3.setLocation("Nakhal Para");
        System.out.println("Building3 Name: " + building3.getName() + ", Location: " + building3.getLocation());
    }
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

   

}
