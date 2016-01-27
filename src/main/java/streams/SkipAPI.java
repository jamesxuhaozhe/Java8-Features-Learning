package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by haozhexu on 1/27/16.
 */
public class SkipAPI {
    private List<Car> cars;

    public SkipAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets unique countries of all the dealership cars, skip 2.
     */
    public List<String> getCountriesSkipTwo(int n) {
        return cars.stream().map(Car::getCountry).distinct().skip(n).collect(toList());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        SkipAPI skipAPI = new SkipAPI(dealerShip.getInventory());
        DistinctAPI distinctAPI = new DistinctAPI(dealerShip.getInventory());
        System.out.println(distinctAPI.getDistinctCountries() + "\n");
        System.out.println(skipAPI.getCountriesSkipTwo(2) + "\n");
    }
}
