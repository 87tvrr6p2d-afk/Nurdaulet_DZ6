public class TravelRequest {

    private double distance;
    private int passengers;
    private String serviceClass; // economy / business
    private boolean hasDiscount;
    private boolean hasLuggage;

    public TravelRequest(double distance, int passengers,
                         String serviceClass,
                         boolean hasDiscount,
                         boolean hasLuggage) {
        this.distance = distance;
        this.passengers = passengers;
        this.serviceClass = serviceClass;
        this.hasDiscount = hasDiscount;
        this.hasLuggage = hasLuggage;
    }

    public double getDistance() { return distance; }
    public int getPassengers() { return passengers; }
    public String getServiceClass() { return serviceClass; }
    public boolean hasDiscount() { return hasDiscount; }
    public boolean hasLuggage() { return hasLuggage; }
}
