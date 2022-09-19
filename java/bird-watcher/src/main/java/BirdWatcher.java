
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        if (birdsPerDay.length != 0) return birdsPerDay[birdsPerDay.length - 1];
        else return 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {

        for (int i = 0; i <birdsPerDay.length ; i++) {

            if (birdsPerDay[i] == 0 )return true;

        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int totalCount = 0;

        //checks if numberOfDays is lower then Array lenght
        if (numberOfDays < birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; i++) {
                totalCount += birdsPerDay[i];
            }
        }

        //if higher jsut counts the whole array
        else {

            for (int i = 0; i <birdsPerDay.length ; i++) {
                totalCount += birdsPerDay[i];
            }
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


    public static void main(String[] args) {
        int [] intArr = {0,2,5,3,7,8,4};
        BirdWatcher bw = new BirdWatcher(intArr);


        bw.incrementTodaysCount();
        System.out.println(bw.getToday());

    }
}
