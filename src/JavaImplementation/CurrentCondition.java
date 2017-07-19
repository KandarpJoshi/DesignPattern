package JavaImplementation;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public class CurrentCondition implements Observer {
    Observable observable;
    public CurrentCondition(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData data = (WeatherData) o;
            System.out.println(data.getTemperature());
        }
    }

}
