package streams;

import car.Car;
import car.DealerShip;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by haozhexu on 1/27/16.
 */
public class DistinctAPI {
    private List<Car> cars;

    public DistinctAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets unique countries of all the dealership cars.
     */
    public List<String> getDistinctCountries() {
        return cars.stream().map(Car::getCountry).distinct().collect(toList());
    }

    /**
     * Gets unique colors of all the dealership cars.
     */
    public List<String> getDistinctColor() {
        return cars.stream().map(Car::getColor).distinct().collect(toList());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        DistinctAPI distinctAPI = new DistinctAPI(dealerShip.getInventory());
        System.out.println(distinctAPI.getDistinctCountries() + "\n");
        System.out.println(distinctAPI.getDistinctColor() + "\n");
    }
}
