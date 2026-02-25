import java.util.*;

public class StockExchange implements Subject {

    private Map<String, Double> stocks = new HashMap<>();
    private Map<String, List<Observer>> observers = new HashMap<>();

    public void setStockPrice(String stockName, double price) {
        stocks.put(stockName, price);
        notifyObservers(stockName);
    }

    @Override
    public void addObserver(String stockName, Observer observer) {
        observers.computeIfAbsent(stockName, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void removeObserver(String stockName, Observer observer) {
        observers.getOrDefault(stockName, new ArrayList<>()).remove(observer);
    }

    @Override
    public void notifyObservers(String stockName) {
        double price = stocks.get(stockName);
        for (Observer observer : observers.getOrDefault(stockName, new ArrayList<>())) {
            observer.update(stockName, price);
        }
    }
}
