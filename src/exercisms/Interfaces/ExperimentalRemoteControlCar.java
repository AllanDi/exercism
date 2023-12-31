package exercisms.Interfaces;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distance;

    @Override
    public void drive() {
        this.distance = this.distance + 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }
}
