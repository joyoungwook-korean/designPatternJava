package creationalPattern.buildPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import creationalPattern.buildPattern.builders.CarBuilder;
import creationalPattern.buildPattern.cars.Car;
import creationalPattern.buildPattern.cars.CarType;
import creationalPattern.buildPattern.components.Transmission;
import creationalPattern.buildPattern.director.Director;

public class builderTest {

    @Test
    public void builderTest() {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();

        director.constructCityCar(carBuilder);
        Car cityCar = carBuilder.getResult();

        assertEquals(cityCar.getCarType(), CarType.CITY_CAR);
        assertEquals(cityCar.getSeats(), 2);
        assertEquals(cityCar.getTransmission(), Transmission.AUTOMATIC);

        CarBuilder carBuilder2 = new CarBuilder();
        director.constructSUV(carBuilder2);
        Car suvCar = carBuilder2.getResult();

        assertEquals(suvCar.getCarType(), CarType.SUV);
        assertEquals(suvCar.getSeats(), 4);
        assertEquals(suvCar.getTransmission(), Transmission.MANUAL);
        assertEquals(suvCar.getTripComputer(), null);
    }
}
