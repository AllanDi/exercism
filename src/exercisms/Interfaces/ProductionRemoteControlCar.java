package exercisms.Interfaces;

class ProductionRemoteControlCar implements RemoteControlCar {


    private int distance;
    int numberOfVictories;

    @Override
    public void drive() {
        this.distance = this.distance + 10;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }
}
