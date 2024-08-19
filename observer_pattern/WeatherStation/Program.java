package observer_pattern.WeatherStation;

class Program {

    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        // no display since no observers
        subject.setMeasurements(5.1, 5.1, 5.1);

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(subject);
        subject.registerObserver(conditionsDisplay);
        // display since registered
        subject.setMeasurements(5.2, 5.2, 5.2);
        subject.setMeasurements(5.3, 5.3, 5.3);

        AdditionalDisplay additionalDisplay = new AdditionalDisplay(subject);
        subject.registerObserver(additionalDisplay);
        
        subject.removeObserver(conditionsDisplay);
        // no display from conditionsDisplay since removed, still display from additionalDisplay
        subject.setMeasurements(0., 0., 0.);
    }
}    
