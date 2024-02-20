package Vehicle;

public interface Maintainable {
    default void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    default void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
