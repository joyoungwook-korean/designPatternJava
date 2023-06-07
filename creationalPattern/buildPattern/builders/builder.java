package creationalPattern.buildPattern.builders;

import creationalPattern.buildPattern.cars.CarType;
import creationalPattern.buildPattern.components.Engine;
import creationalPattern.buildPattern.components.GPSNavigator;
import creationalPattern.buildPattern.components.Transmission;
import creationalPattern.buildPattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}