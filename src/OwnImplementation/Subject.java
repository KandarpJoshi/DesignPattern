package OwnImplementation;

/**
 * Created by kandarp.jo on 19/07/17.
 */
public interface Subject {
     void removeSubscriber(Observer o);
     void addSubscriber(Observer o);
     void notifyObserver();
}
