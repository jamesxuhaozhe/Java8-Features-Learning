package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by haozhexu on 1/27/16.
 */
public class LimitAPI {
    private List<Car> cars;

    public LimitAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets the first two unique countries of the dealership cars.
     */
    public List<String> getFirstTwoCountries() {
        return cars.stream().map(Car::getCountry).distinct().limit(2).collect(toList());
    }

    /**
     * Gets the first three unique colors of the dealership cars.
     */
    public List<String> getFirstThreeColors() {
        return cars.stream().map(Car::getColor).distinct().limit(3).collect(toList());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        LimitAPI limitAPI = new LimitAPI(dealerShip.getInventory());
        System.out.println(limitAPI.getFirstTwoCountries() + "\n");
        System.out.println(limitAPI.getFirstThreeColors() + "\n");
    }
}

