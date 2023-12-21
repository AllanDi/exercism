package exercisms.constructors;


public class NeedForSpeed {

    int speed;
    int batteryDrain;
    int distance;
    int battery;

    public int getDistance(){
        return this.distance;
    }

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        if (this.battery >= 100) {
            return true;
        }
        return false;
    }
    public int distanceDriven() {
        return this.distance;
    }
    public void drive() {
        if (this.battery < 100) {
            this.distance = this.distance + this.speed;
            this.battery = this.battery +this.batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}
class RaceTrack {
    int distance;
    void RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }
        if(this.distance <= car.distance){
            return true;
        }
        return false;
    }
}
