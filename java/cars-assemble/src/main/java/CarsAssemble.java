public class CarsAssemble {

    public enum SuccesChance{

        _100_PERCENT,
        _90_PERCENT,
        _80_PERCENT,
        _77_PERCENT,

    }

    public static final int CarsPerHour = 221;

    public double productionRatePerHour(int speed) {

        SuccesChance succes = null;
        double failureChance = 0;

        if (speed >= 1 && speed <= 4) {
            succes = SuccesChance._100_PERCENT;
        }
        else if (speed >= 5 && speed <= 8){
            succes = SuccesChance._90_PERCENT;
        }
        else if (speed == 9){
            succes = SuccesChance._80_PERCENT;
        }
        else if (speed == 10){
            succes = SuccesChance._77_PERCENT;
        }

        if (succes != null) {

            switch (succes) {

                case _77_PERCENT:
                    failureChance = 0.77;
                    break;
                case _90_PERCENT:
                    failureChance = 0.9;
                    break;
                case _80_PERCENT:
                    failureChance = 0.8;
                    break;
                case _100_PERCENT:
                    failureChance = 1;
                    break;
            }
        }
        if (failureChance != 0) {
            return CarsPerHour * speed * failureChance;
        }

        return 0;

    }

    public int workingItemsPerMinute(int speed) {

        double perMinute = productionRatePerHour(speed) / 60;
        return (int) perMinute;
    }
}
