
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length];
    }

    public void incrementTodaysCount() {
        birdsPerDay[getToday()] ++;
    }

    public boolean hasDayWithoutBirds() {

        for (int i = 0; i <birdsPerDay.length ; i++) {

            if (birdsPerDay[i] == 0 )return true;

        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int totalCount = 0;
        for (int i = numberOfDays; i >= 1 ; i--) {

            totalCount += birdsPerDay[i];

        }

        return totalCount;
    }

    public int getBusyDays() {

        int busyDays = 0;

        for (int i = 0; i <birdsPerDay.length ; i++) {

            if (birdsPerDay[i] >= 5) busyDays++;
        }

        return busyDays;
    }

}
