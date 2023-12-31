package exercisms.Interfaces;

class ProductionRemoteControlCar implements RemoteControlCar {


    private int distance;

    @Override
    public void drive() {
        this.distance = this.distance + 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
}
