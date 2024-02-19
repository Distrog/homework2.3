package Vehicle;

public interface HavingEngine {
    default void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}
