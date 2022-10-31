import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
    List<ProductionRemoteControlCar> listOfCars = new LinkedList<>();
    listOfCars.add(prc1);
    listOfCars.add(prc2);
    Collections.sort(listOfCars);
    return listOfCars;

    }
}
