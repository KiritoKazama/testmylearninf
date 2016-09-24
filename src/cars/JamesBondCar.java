package cars;

import test.OwnerCar;

/**
 * Created by Kirito on 24.09.2016.
 */
public class JamesBondCar extends Car {
    public JamesBondCar() {
        super("Aston martin", "Hetchback" , "Red", 2000 , 206);
    }

    public JamesBondCar(String typeCar, String color, int weight, int horsepower) {
        super("Aston martin", typeCar, color, weight, horsepower);
    }

    public int drive(int howlong){
        System.out.println("Скорость авто 100 км/ч");
        int distance = howlong*100;
        return distance;
    }
    public static void main(String[] args) {
        OwnerCar ownerCar = new OwnerCar("James BOND", new JamesBondCar());
        System.out.println(ownerCar.getNameOwner());
        System.out.println(ownerCar.getLitleCar().drive(1) + " ; " + ownerCar.getLitleCar().toString());
    }
}
