public class Main {

    public static void main(String[] args) {

        TravelBookingContext context = new TravelBookingContext();

        TravelRequest request = new TravelRequest(
                1000,      // distance
                2,         // passengers
                "business",
                true,      // discount
                true       // luggage
        );

        context.setStrategy(new PlaneCostStrategy());
        System.out.println("Plane cost: " + context.calculate(request));

        context.setStrategy(new TrainCostStrategy());
        System.out.println("Train cost: " + context.calculate(request));

        context.setStrategy(new BusCostStrategy());
        System.out.println("Bus cost: " + context.calculate(request));
    }
}
