package Vehicle;

public class Car  extends Vehicle implements HavingEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
