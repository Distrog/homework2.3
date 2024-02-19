package Vehicle;

public class Truck extends Vehicle implements HavingEngine, HavingTrailer{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
