package streams;

import car.Car;
import car.DealerShip;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Created by haozhexu on 1/27/16.
 */
public class FlatMapAPI {
    private List<Car> cars;

    public FlatMapAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets unique character in String used in countries.
     */
    public Set<String> getUniqueCharsUsedInCarCountries() {
        return cars.stream().map(Car::getCountry).distinct().map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toSet());

    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        FlatMapAPI flatMapAPI = new FlatMapAPI(dealerShip.getInventory());
        System.out.println(flatMapAPI.getUniqueCharsUsedInCarCountries() + "\n");
    }
}
