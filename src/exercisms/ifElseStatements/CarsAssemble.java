package exercisms.ifElseStatements;

public class CarsAssemble {

    public static void main(String[] args) {

        CarsAssemble carsAssemble = new CarsAssemble();

        System.out.println(carsAssemble.productionRatePerHour(1));
        System.out.println(carsAssemble.workingItemsPerMinute(6));

    }

    int standardProducedCarPerHour = 221;

    public double productionRatePerHour(int speed) {

        double sucessRate = 1;

        if (speed > 4 && speed <= 8) {
            sucessRate = 0.9;
        } else if (speed > 8 && speed <= 9) {
            sucessRate = 0.8;
        } else if (speed > 9) {
            sucessRate = 0.77;
        }
        return (speed * standardProducedCarPerHour) * sucessRate;
    }


    public int workingItemsPerMinute(int speed) {
        double sucessRate = 1;

        if (speed > 4 && speed <= 8) {
            sucessRate = 0.9;
        } else if (speed > 8 && speed <= 9) {
            sucessRate = 0.8;
        } else if (speed > 9) {
            sucessRate = 0.77;
        }
        return (int) (((speed * standardProducedCarPerHour) * sucessRate) / 60);
    }

    /*

        private final static int HOURLY_PRODUCTION_RATE = 221;
    private final static Map<Integer, Double> SUCCESS_RATE = Map.ofEntries(
            Map.entry(0, 1.0),
            Map.entry(1, 1.0),
            Map.entry(2, 1.0),
            Map.entry(3, 1.0),
            Map.entry(4, 1.0),
            Map.entry(5, 0.9),
            Map.entry(6, 0.9),
            Map.entry(7, 0.9),
            Map.entry(8, 0.9),
            Map.entry(9, 0.8),
            Map.entry(10, 0.77)
    );
    public double productionRatePerHour(int speed) {
        return speed * HOURLY_PRODUCTION_RATE * SUCCESS_RATE.get(speed);
    }
    public int workingItemsPerMinute(int speed) {
        return  (int) productionRatePerHour(speed) / 60;
    }

     */

}
