package cars;

/**
 * Created by Kirito on 24.09.2016.
 */
public class Car {
    String BrendCar;
    String TypeCar;
    String Color;
    int weight;
    int horsepower;

    public Car(String carBrand){
        // create avto
        BrendCar = carBrand;
        TypeCar = "Sedan";
        Color = "Black";
        weight = 1500;
        horsepower = 175;
    }

    public Car(String brendCar, String typeCar, String color, int weight, int horsepower) {
        BrendCar = brendCar;
        TypeCar = typeCar;
        Color = color;
        this.weight = weight;
        this.horsepower = horsepower;
    }

    public void Start(){
        System.out.println("начать ехать");
    }

    public void Stop(){
        System.out.println("остановка");
    }

    public int drive(int howlong) {
        System.out.println("Скорость авто 60 км/ч");
        int distance = howlong * 60;
        return distance;
    }

    public String getBrendCar() {
        return BrendCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "BrendCar='" + BrendCar + '\'' +
                ", TypeCar='" + TypeCar + '\'' +
                ", Color='" + Color + '\'' +
                ", weight=" + weight +
                ", horsepower=" + horsepower +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("tmp");
        car.Start();
        System.out.println(car.toString());
    }

}
