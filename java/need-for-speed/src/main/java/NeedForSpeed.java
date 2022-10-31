class NeedForSpeed {

    private int battery = 100;
    private int distance = 0;
    private final int speed;
    private final int batteryDrain;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.battery -= batteryDrain;
            this.distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private final int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {

        do {
            car.drive();
        }while (!car.batteryDrained());

        if (car.distanceDriven() >= this.distance){
            return true;
        }
        return false;
    }
}
