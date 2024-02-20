package Service;

import Vehicle.Maintainable;
import Vehicle.Vehicle;

public class ServiceStation {
    public void check(Maintainable maintainable) {
        Vehicle vehicle = (Vehicle) maintainable;
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            maintainable.updateTyre();
        }
        maintainable.checkTrailer();
        maintainable.checkEngine();
    }
}
