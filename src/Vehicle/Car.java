package Vehicle;

public class Car  extends Vehicle implements Maintainable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTrailer() {

    }
}
