public class ElonsToyCar {

    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {

        return new ElonsToyCar();
    }

    public String distanceDisplay() {
       return "Driven "+distanceDriven+ " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage > 0) {
            return "Battery at " + batteryPercentage + "%";
        }
        else return "Battery empty";
    }

    public void drive() {
        if(this.batteryPercentage != 0) {
            this.distanceDriven = this.distanceDriven + 20;
            this.batteryPercentage = this.batteryPercentage - 1;
        }
        else System.out.println("Battery Percentage to low to drive");
    }
}
