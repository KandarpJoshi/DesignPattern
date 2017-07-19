package OwnImplementation;

import java.util.HashSet;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public class WeatherData implements Subject{
    HashSet<Observer>  observersSet;
    private float temperature;
    private float pressure;
    private float humidity;
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    public WeatherData(){
        observersSet = new HashSet<>();
    }
    @Override
    public void removeSubscriber(Observer o) {
        observersSet.remove(o);
    }

    @Override
    public void addSubscriber(Observer o) {
        observersSet.add(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observersSet){
            o.update(this);
        }
    }


}
