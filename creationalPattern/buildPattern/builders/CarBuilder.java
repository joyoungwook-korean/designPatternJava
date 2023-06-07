package creationalPattern.buildPattern.builders;

import creationalPattern.buildPattern.cars.Car;
import creationalPattern.buildPattern.cars.CarType;
import creationalPattern.buildPattern.components.Engine;
import creationalPattern.buildPattern.components.GPSNavigator;
import creationalPattern.buildPattern.components.Transmission;
import creationalPattern.buildPattern.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
