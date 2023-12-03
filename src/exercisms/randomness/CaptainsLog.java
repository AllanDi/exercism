package exercisms.randomness;

import java.util.Random;

 public class CaptainsLog {

     public static void main(String[] args) {

         CaptainsLog captainsLog = new CaptainsLog(new Random());
         System.out.println(captainsLog.randomPlanetClass());
         System.out.println(captainsLog.randomShipRegistryNumber());
         System.out.println(captainsLog.randomStardate());
     }

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    public CaptainsLog(Random random) {
        this.random = random;
    }

    public char randomPlanetClass() {

        int randomValue = (random.nextInt(PLANET_CLASSES.length));
        return PLANET_CLASSES[randomValue];

    }

    public String randomShipRegistryNumber() {

        int randomValue = (random.nextInt(9000)) + 1000;
        return "NCC-"+randomValue;

    }

    public double randomStardate() {

        double randomValue = (random.nextDouble(1000)) + 41000;
        return randomValue;

    }

    /*
    import java.util.Random;

class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }

    double randomStardate() {
        return 41000 + 1000 * random.nextDouble();
    }
}
     */
}
