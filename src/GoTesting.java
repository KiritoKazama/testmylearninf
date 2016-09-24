import cars.Car;
import cars.JamesBondCar;
import test.OwnerCar;

/**
 * Created by Kirito on 24.09.2016.
 */
public class GoTesting {
    public static void main(String[] args){
        System.out.println("Фигня какаято");
        Car car = new Car("Dodg","Cabriolet","Red",2500,545);
        Car car2 = new JamesBondCar("Jeep","Serebro",5000,1254);

        OwnerCar Dimon = new OwnerCar("Dimon", car);
        OwnerCar Demetra = new OwnerCar("Demetra", car2);

        System.out.println(Dimon.toString());

        System.out.println();
//
//        car2.Start();
//        car2.Stop();
//        System.out.println("Прокатились" + car2.drive(10));

        System.out.println(Demetra);
    }
}
