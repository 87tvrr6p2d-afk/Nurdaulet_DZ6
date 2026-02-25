public interface Subject {
    void addObserver(String stockName, Observer observer);
    void removeObserver(String stockName, Observer observer);
    void notifyObservers(String stockName);
}
