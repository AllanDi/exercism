package exercisms.Interfaces;

import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        throw new UnsupportedOperationException("Please implement the (static) TestTrack.getRankedCars() method");
    }

    public static void main(String[] args) {

        ProductionRemoteControlCar productionRemoteControlCar = new ProductionRemoteControlCar();

        productionRemoteControlCar.setNumberOfVictories(5);
        productionRemoteControlCar.setNumberOfVictories(6);
        System.out.println(productionRemoteControlCar.getNumberOfVictories());


    }
}
