package observer_pattern.WeatherStation;

public class AdditionalDisplay implements Observer, DisplayElement {
    
    private String message = "From additional display";
    private WeatherData subject;

    public AdditionalDisplay(WeatherData _subject){
        this.subject = _subject;
    }

    public void update(){
        // nothing to be done here, do something with subject if wanted to

        display();
    }

    public void display(){
        System.out.println(message);
    }
    
}
