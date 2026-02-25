public class BusCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double basePrice = request.getDistance() * 0.2;

        if (request.hasDiscount()) {
            basePrice *= 0.9;
        }

        return basePrice * request.getPassengers();
    }
}
