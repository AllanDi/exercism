package exercisms.classes;

public class ElonsToyCar {

    int battery = 100;
    int distance = 0;
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }
    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }
    public String batteryDisplay() {
        return "Battery at " + this.battery + "%";
    }
    public void drive() {

    }
}
