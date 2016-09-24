package test;

import cars.Car;

/**
 * Created by Kirito on 24.09.2016.
 */
public class OwnerCar {
    private String nameOwner;
    private Car litleCar;

    public OwnerCar(String name, Car car){
        nameOwner = name;
        litleCar = car;
        System.out.println("Создание " + getClass().getName() + " with params " + name + " " + car);
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public Car getLitleCar() {
        return litleCar;
    }

    @Override
    public String toString() {
        litleCar.Start();
        litleCar.Stop();
        return "OwnerCar " + litleCar.drive(3) + " " + nameOwner;
    }

    public static void main(String[] args) {
        OwnerCar ownerCar = new OwnerCar("Bruse Wayne", new Car("BatMobil"));
        System.out.println(ownerCar.getNameOwner());
        System.out.println(ownerCar.getLitleCar().drive(1) + " ; " + ownerCar.getLitleCar().getBrendCar());
    }
}
