package observer_pattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public Double getTemperature(){
        return this.temperature;
    }

    public Double getHumidity(){
        return this.humidity;
    }

    public Double getPressure(){
        return this.pressure;
    }

    public void setMeasurements(Double newTemperature, Double newHumidity, Double newPressure) {
        this.temperature = newTemperature;
        this.humidity = newHumidity;
        this.pressure = newPressure;

        notifyObservers();
    }

    public void registerObserver(Observer newObserver){
        observers.add(newObserver);
    }

    public void removeObserver(Observer oldObserver){
        observers.remove(oldObserver);
    }

    public void notifyObservers(){
        for (Observer o : this.observers){
            o.update();
        }
    }
}
