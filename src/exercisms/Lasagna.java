package exercisms;

public class Lasagna {
    public static void main(String[] args) {

        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));
    }
    int expectedMinutesInOven = 40;
    int layerCookTime = 2;

    public int expectedMinutesInOven(){
        return expectedMinutesInOven;
    }
    public int remainingMinutesInOven(int minutes){
        int timeRemain = this.expectedMinutesInOven - minutes;
        return timeRemain;
    }
    public int preparationTimeInMinutes(int layers){
        int preparationTime = this.layerCookTime * layers;
        return preparationTime;
    }
    public int totalTimeInMinutes(int numberLayers, int timeCookingMinutes){
        int totalTime = (this.layerCookTime * numberLayers) + timeCookingMinutes;
        return totalTime;
    }

    /*

    public class Lasagna {
        // TODO: define the 'expectedMinutesInOven()' method
        public static int expectedMinutesInOven(){
            return 40;
        }
        // TODO: define the 'remainingMinutesInOven()' method
        public static int remainingMinutesInOven(int minutes){
            return Lasagna.expectedMinutesInOven() - minutes;
        }
        // TODO: define the 'preparationTimeInMinutes()' method
        public static int preparationTimeInMinutes(int layers){
            return layers * 2;
        }
        // TODO: define the 'totalTimeInMinutes()' method
        public static int totalTimeInMinutes(int layers, int minutes){
            return preparationTimeInMinutes(layers) + minutes;
        }
    }

    */

}
