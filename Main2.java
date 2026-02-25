public class Main {

    public static void main(String[] args) {

        StockExchange exchange = new StockExchange();

        Trader trader1 = new Trader("Nurdaulet");
        TradingRobot robot = new TradingRobot(100);

        exchange.addObserver("AAPL", trader1);
        exchange.addObserver("AAPL", robot);

        exchange.setStockPrice("AAPL", 90);
        exchange.setStockPrice("AAPL", 120);
    }
}
