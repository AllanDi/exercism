package exercisms.Interfaces;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distance;

    public void drive() {
        this.distance = this.distance + 20;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }
}
