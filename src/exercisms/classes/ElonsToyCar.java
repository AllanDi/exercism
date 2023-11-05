package exercisms.classes;

public class ElonsToyCar {

    public static void main(String[] args) {

        System.out.println(ElonsToyCar.buy());
        System.out.println(ElonsToyCar.buy().distanceDisplay());
        System.out.println(ElonsToyCar.buy().batteryDisplay());
        ElonsToyCar car = ElonsToyCar.buy();

        for (int i = 0; i < 100; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

    }

    public int battery = 100;
    public int distance = 0;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery > 0) {
            return "Battery at " + this.battery + "%";
        } else return "Battery empty";
    }

    public void drive() {
        if (this.battery>0) {
            this.distance = this.distance + 20;
            this.battery = battery - 1;
        }
    }

//    public class ElonsToyCar {
//        private int distanceDriven;
//        private int batteryPercentage = 100;
//
//        public static ElonsToyCar buy() {
//            return new ElonsToyCar();
//        }
//        public String distanceDisplay() {
//            return String.format("Driven %d meters", distanceDriven);
//        }
//        public String batteryDisplay() {
//            if (this.batteryPercentage == 0) {
//                return "Battery empty";
//            }
//            return String.format("Battery at %d%%", batteryPercentage);
//        }
//        public void drive() {
//            if(this.batteryPercentage != 0) {
//                this.distanceDriven += 20;
//                this.batteryPercentage--;
//            }
//        }
//    }

}
