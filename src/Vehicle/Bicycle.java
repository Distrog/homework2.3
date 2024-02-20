package Vehicle;

public class Bicycle extends Vehicle implements Maintainable{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTrailer() {
    }

    @Override
    public void checkEngine() {
    }
}
