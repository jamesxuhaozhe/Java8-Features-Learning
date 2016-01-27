package streams;

import car.Car;
import car.DealerShip;

import java.util.List;
import java.util.Optional;

/**
 * Created by haozhexu on 1/27/16.
 */
public class FindFirst {
    private List<Car> cars;

    public FindFirst(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * print first Country
     */
    public void findFirstCountry() {
        Optional<Car> firstCountry = cars.stream().findFirst();
        firstCountry.ifPresent(car -> System.out.println(car));
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        FindFirst findFirst = new FindFirst(dealerShip.getInventory());
        findFirst.findFirstCountry();
    }
}
