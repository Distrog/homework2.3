package Vehicle;

abstract public class TrailerVehicle extends EngineVehicle{
    public TrailerVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check(){
        super.check();
        checkTrailer();
    }
}
