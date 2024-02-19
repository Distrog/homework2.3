package Service;

import Vehicle.Vehicle;
import Vehicle.Truck;

public class ServiceStationTruck implements ServiceStation {
    @Override
    public void check(Vehicle vehicle) {
        Truck truck = (Truck) vehicle;
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}
