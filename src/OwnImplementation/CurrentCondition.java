package OwnImplementation;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public class CurrentCondition implements  Observer {
    Subject subject;
    public CurrentCondition(Subject subject){
        this.subject = subject;
        subject.addSubscriber(this);
    }
    @Override
    public void update(Subject subject) {
        if(subject instanceof  WeatherData){
            WeatherData data = (WeatherData) subject;
            float temperature = data.getTemperature();
            System.out.println(temperature);
        }

    }
}
