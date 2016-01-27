package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by haozhexu on 1/27/16.
 */
public class SortedAPI {
    private List<Car> cars;

    public SortedAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets a list of cars sorted by their vin numbers.
     */
    public List<Car> getSortedCarsByVin() {
        return cars.stream().sorted(comparing(Car::getVin)).collect(toList());
    }

    /**
     * Gets a list of cars sorted by their year.
     */
    public List<Car> getSortedCarsByYear() {
        return cars.stream().sorted(comparing(Car::getYear)).collect(toList());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        SortedAPI sortedAPI = new SortedAPI(dealerShip.getInventory());
        System.out.println(sortedAPI.getSortedCarsByVin() + "\n");
        System.out.println(sortedAPI.getSortedCarsByYear() + "\n");
    }
}
