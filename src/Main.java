import Service.ServiceStation;
import Service.ServiceStationBicycle;
import Service.ServiceStationCar;
import Service.ServiceStationTruck;
import Vehicle.Truck;
import Vehicle.Car;
import Vehicle.Vehicle;
import Vehicle.Bicycle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle truck = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);

        Vehicle bicycle = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

//        ServiceStation stationBicycle = new ServiceStationBicycle();
//        ServiceStation stationCar = new ServiceStationCar();
//        ServiceStation stationTruck = new ServiceStationTruck();
//        stationCar.check(car);
//        System.out.println("_____________________________________________");
//        stationCar.check(car2);
//        System.out.println("_____________________________________________");
//        stationBicycle.check(bicycle);
//        System.out.println("_____________________________________________");
//        stationBicycle.check(bicycle2);
//        System.out.println("_____________________________________________");
//        stationTruck.check(truck);
//        System.out.println("_____________________________________________");
//        stationTruck.check(truck2);

        check(car);
        System.out.println("_____________________________________________");
        check(car2);
        System.out.println("_____________________________________________");
        check(bicycle);
        System.out.println("_____________________________________________");
        check(bicycle2);
        System.out.println("_____________________________________________");
        check(truck);
        System.out.println("_____________________________________________");
        check(truck2);
        System.out.println("________________________________");
    }

    public static void check(Vehicle vehicle) {
        ServiceStation serviceStation;
        if (vehicle.getClass() == Car.class) {
            serviceStation = new ServiceStationCar();
        } else if(vehicle.getClass()== Bicycle.class){
            serviceStation = new ServiceStationBicycle();
        } else if (vehicle.getClass()==Truck.class){
            serviceStation = new ServiceStationTruck();
        } else {
            System.out.println("Данное транспортное средство не обслуживается в сервисе");
            return;
        }

        serviceStation.check(vehicle);
    }
}