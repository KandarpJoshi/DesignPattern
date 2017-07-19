package JavaImplementation;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public class Main {
    public static void main(String cd[]){
        WeatherData data = new WeatherData();
        Observer observer = new CurrentCondition(data);

        data.setTemperature(1);
        data.measurementChanged();
        data.setTemperature(2);
        data.measurementChanged();

    }
}
