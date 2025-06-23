public class Main {

    // Recursive method to calculate future value
    public static double forecastFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: grow by (1 + growthRate) and reduce years by 1
        return forecastFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0; // Starting amount
        double annualGrowthRate = 0.08; // 8% growth
        int years = 5;

        double futureValue = forecastFutureValue(initialValue, annualGrowthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, futureValue);
    }
}
