package streams;

import car.Car;
import car.DealerShip;

import java.util.List;
import java.util.Optional;

/**
 * Created by haozhexu on 1/27/16.
 */
public class FindAny {
    private List<Car> cars;

    public FindAny(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Return any foreign made car if there is any, otherwise return no Foreign Car.
     */
    public String getAnyForeignMadeCar() {
        Optional<Car> foreignCar = cars.stream().filter(Car::isForeign).findAny();
        return foreignCar.isPresent() ? foreignCar.get().toString() : "No Foreign Car";
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        FindAny findAny = new FindAny(dealerShip.getInventory());
        System.out.println(findAny.getAnyForeignMadeCar() + "\n");
    }
}
