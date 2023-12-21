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

    /*

    class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int batteryDrain = 0;
    private int speed = 5;
    private int distanceDriven = 0;
    private int remainingBattery = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.remainingBattery < this.batteryDrain){
            return true;
        }else
            return false;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDriven = this.distanceDriven + this.speed;
            this.remainingBattery = this.remainingBattery - this.batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance = 800;
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance){
            return true;
        }else
            return false;
    }
}
     */
}
