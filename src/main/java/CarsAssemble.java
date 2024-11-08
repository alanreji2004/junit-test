public class CarsAssemble {
    private static final int CARS_PER_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0;
        }
        
        return speed * CARS_PER_HOUR * successRate(speed);
    }
    public int workingItemsPerMinute(int speed) {
        return (int) ((CARS_PER_HOUR / 60.0) * speed * successRate(speed));
    }
    private double successRate(int speed) {
        double rate = 0;
        if (speed >= 1 && speed <= 4) {
            rate = 1;
        } else if (speed >= 5 && speed <= 8) {
            rate = 0.9;
        } else if (speed == 9) {
            rate = 0.8;
        } else {
            rate = 0.77;
        }
        
        return rate;
    }
}