package Service;

import Vehicle.Vehicle;
import Vehicle.Car;

public class ServiceStationCar implements ServiceStation {

    @Override
    public void check(Vehicle vehicle) {
        Car car = (Car) vehicle;
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }
}
