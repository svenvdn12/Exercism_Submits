class ProductionRemoteControlCar implements Comparable<ProductionRemoteControlCar>, RemoteControlCar{

    private int numberOfVictories = 0;
    private int distanceTravelled = 0;

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
       this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {

        if (this.getNumberOfVictories() == o.getNumberOfVictories()) return 0;
        else if (this.getNumberOfVictories() > o.getNumberOfVictories()) return 1;
        else return -1;
    }
}
