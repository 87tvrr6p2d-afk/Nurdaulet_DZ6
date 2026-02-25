public class TrainCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double basePrice = request.getDistance() * 0.3;

        if (request.getServiceClass().equalsIgnoreCase("business")) {
            basePrice *= 1.3;
        }

        if (request.hasDiscount()) {
            basePrice *= 0.85;
        }

        return basePrice * request.getPassengers();
    }
}
