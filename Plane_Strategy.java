public class PlaneCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double basePrice = request.getDistance() * 0.5;

        if (request.getServiceClass().equalsIgnoreCase("business")) {
            basePrice *= 1.5;
        }

        if (request.hasLuggage()) {
            basePrice += 50;
        }

        if (request.hasDiscount()) {
            basePrice *= 0.9;
        }

        return basePrice * request.getPassengers();
    }
}
