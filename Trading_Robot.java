public class TradingRobot implements Observer {

    private double threshold;

    public TradingRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stockName, double price) {
        if (price > threshold) {
            System.out.println("Robot: Selling " + stockName);
        } else {
            System.out.println("Robot: Buying " + stockName);
        }
    }
}
