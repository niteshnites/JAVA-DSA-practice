package interview_prep;

import java.util.ArrayList;
import java.util.List;

/*
The Observer Design Pattern is a behavioral design pattern where an object (the subject)
maintains a list of dependents (observers) and notifies them of any state changes,
typically by calling one of their methods. This pattern is useful when you need a
one-to-many relationship between objects, such that if one object changes state,
all its dependents are notified and updated automatically.
 */

// Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Observer Interface
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // Notify observers of the state change
    }
}

// Concrete Observer 1
class PhoneDisplay implements Observer {
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " - Updated Weather: Temp = " + temperature + "°C, Humidity = " + humidity + "%, Pressure = " + pressure + " hPa");
    }
}

// Concrete Observer 2
class WebAppDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("WebApp Display - Weather Update: Temp = " + temperature + "°C, Humidity = " + humidity + "%, Pressure = " + pressure + " hPa");
    }
}

// Main Class
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create Subject
        WeatherStation weatherStation = new WeatherStation();

        // Create Observers
        PhoneDisplay phoneDisplay1 = new PhoneDisplay("Phone 1");
        PhoneDisplay phoneDisplay2 = new PhoneDisplay("Phone 2");
        WebAppDisplay webAppDisplay = new WebAppDisplay();

        // Add Observers
        weatherStation.addObserver(phoneDisplay1);
        weatherStation.addObserver(phoneDisplay2);
        weatherStation.addObserver(webAppDisplay);

        // Simulate weather changes
        System.out.println("Setting measurements to 25°C, 60%, 1012 hPa...");
        weatherStation.setMeasurements(25, 60, 1012);

        System.out.println("Setting measurements to 30°C, 70%, 1010 hPa...");
        weatherStation.setMeasurements(30, 70, 1010);

        // Remove an observer and simulate another change
        System.out.println("Removing Phone 2 from observers...");
        weatherStation.removeObserver(phoneDisplay2);

        System.out.println("Setting measurements to 20°C, 50%, 1015 hPa...");
        weatherStation.setMeasurements(20, 50, 1015);
    }
}
