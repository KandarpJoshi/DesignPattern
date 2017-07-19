package JavaImplementation;

import java.util.Observable;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public class WeatherData extends Observable {
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

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
