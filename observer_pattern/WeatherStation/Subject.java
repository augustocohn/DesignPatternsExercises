package observer_pattern.WeatherStation;

/**
 * Subject
 */
public interface Subject {

    public void registerObserver(Observer newObserver);
    public void removeObserver(Observer oldObserver);
    public void notifyObservers();
}
