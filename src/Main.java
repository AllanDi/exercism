import exercisms.arrays.BirdWatcher;

public class Main {
    public static void main(String[] args) {



     BirdWatcher birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});

        System.out.println(birdWatcher);
        System.out.println(birdWatcher.getLastWeek());
        System.out.println(birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();
        System.out.println(birdWatcher.getToday());
        System.out.println(birdWatcher.hasDayWithoutBirds());





    }
}