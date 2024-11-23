package br.com.lucas.padroesdeprojetoum.factory;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;
    private String name;

    public Car(int horsePower, String fuelSource, String color, String name){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize " + horsePower);
    }
    public void clean(){
        System.out.println("The "  + name + " has been cleaned, and the " + color.toLowerCase() + " color shine");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything is good.");
    }
    public void fuelCar(){
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }




}
