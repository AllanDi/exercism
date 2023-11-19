package exercisms.arrays;

public class BirdWatcher {
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
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
