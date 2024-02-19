package Service;

import Vehicle.Vehicle;
import Vehicle.Bicycle;

public class ServiceStationBicycle implements ServiceStation {

    @Override
    public void check(Vehicle vehicle) {
        Bicycle bicycle = (Bicycle) vehicle;
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}
