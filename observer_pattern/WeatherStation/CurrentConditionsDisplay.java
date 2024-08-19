package observer_pattern.WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Double temperature = 0.;
    private Double humidity = 0.;
    private Double pressure = 0.;
    private WeatherData subject;    

    public CurrentConditionsDisplay(WeatherData _subject){
        this.subject = _subject;
    }

    public void update() {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        this.pressure = subject.getPressure();

        display();
    }

    public void display() {
        System.out.println("Temperature: " + this.temperature + " Humidity: " + this.humidity + " Pressure: " + this.pressure);
    }
}
