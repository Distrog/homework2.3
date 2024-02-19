package Vehicle;

public interface HavingTrailer {
    default void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
}
