package Service;

import Vehicle.Maintainable;
import Vehicle.Vehicle;

public class ServiceStation {
    public void check(Maintainable maintainable) {
        maintainable.check();
    }
}
