package exercisms.arrays;

public class BirdWatcher {

    public static void main(String[] args) {

        BirdWatcher birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});

        System.out.println(birdWatcher);
        System.out.println(birdWatcher.getLastWeek());
        System.out.println(birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();
        System.out.println(birdWatcher.getToday());
        System.out.println(birdWatcher.hasDayWithoutBirds());
        System.out.println(birdWatcher.getCountForFirstDays(4));
        System.out.println(birdWatcher.getCountForFirstDays(10));
        System.out.println(birdWatcher.getBusyDays());
    }

    private final int[] birdsPerDay;
    int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.lastWeek;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] = birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int n : this.birdsPerDay) {
            if (n == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        if (numberOfDays >= this.birdsPerDay.length ) {
            numberOfDays = this.birdsPerDay.length;
        }
            int sum = 0;
            for (int i = 0; i < numberOfDays; i++) {
                sum = this.birdsPerDay[i] + sum;
            }
        return sum;
    }

    public int getBusyDays() {
        int sum =0;
        for (int n:this.birdsPerDay){
            if (n>=5){
                sum = sum+1;
            }
        }
        return sum;
    }

    /*

    import java.util.Arrays;

    class BirdWatcher {
        private int[] birdsPerDay;

        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay;
        }
        public int[] getLastWeek() {
            return birdsPerDay;
        }

        public int getToday() {
            return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
        }

        public int incrementTodaysCount() {
            int idx = birdsPerDay.length - 1;
            birdsPerDay[idx] = ++birdsPerDay[idx];
            return birdsPerDay[idx];
        }

        public boolean hasDayWithoutBirds() {
            return Arrays.stream(birdsPerDay).filter(a -> a == 0).findAny().isPresent();
        }

        public int getCountForFirstDays(int numberOfDays) {
            return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
        }

        public int getBusyDays() {
            return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
        }
    }
    */


}
