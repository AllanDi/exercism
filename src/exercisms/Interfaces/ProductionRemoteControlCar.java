package exercisms.Interfaces;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {


    private int distance;
    private int numberOfVictories;


    public void drive() {
        this.distance = this.distance + 10;
    }


    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar compCar) {
        return Integer.compare(compCar.getNumberOfVictories(), getNumberOfVictories());
    }
}
