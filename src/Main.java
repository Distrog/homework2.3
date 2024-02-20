
import Service.ServiceStation;
import Vehicle.Truck;
import Vehicle.Car;
import Vehicle.Vehicle;
import Vehicle.Maintainable;
import Vehicle.Bicycle;

public class Main {
    public static void main(String[] args) {
        Maintainable car = new Car("car1", 4);
        Maintainable car2 = new Car("car2", 4);

        Maintainable truck = new Truck("truck1", 6);
        Maintainable truck2 = new Truck("truck2", 8);

        Maintainable bicycle = new Bicycle("bicycle1", 2);
        Maintainable bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        System.out.println("____________________________________");
        serviceStation.check(car2);
        System.out.println("____________________________________");
        serviceStation.check(bicycle);
        System.out.println("____________________________________");
        serviceStation.check(bicycle2);
        System.out.println("____________________________________");
        serviceStation.check(truck);
        System.out.println("____________________________________");
        serviceStation.check(truck2);
    }
}