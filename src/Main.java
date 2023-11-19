import exercisms.arrays.BirdWatcher;

public class Main {
    public static void main(String[] args) {


        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        System.out.println(birdWatcher.getLastWeek());
        System.out.println(birdWatcher.getToday());


    }
}