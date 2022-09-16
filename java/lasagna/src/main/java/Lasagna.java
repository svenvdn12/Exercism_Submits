public class Lasagna {

    public static final int TIME_PER_LAYER = 2;
    public static final int TOTAL_PREP_TIME = 40;


    public int expectedMinutesInOven(){
        return TOTAL_PREP_TIME;
    }

    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers){
        return TIME_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int timeInOven){
        return preparationTimeInMinutes(layers) + timeInOven;
    }

}
