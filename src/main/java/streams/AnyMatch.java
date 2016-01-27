package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class AnyMatch {
    private List<Car> cars;

    public AnyMatch(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Return true if there is any foreign made car.
     */
    public boolean isThereAnyForeignCar() {
        return cars.stream().anyMatch(Car::isForeign);
    }

    /**
     * Return true if there is any Japanese car.
     */
    public boolean isThereAnyJapaneseCar() {
        return cars.stream().anyMatch(car -> car.getCountry().equals("Japan"));
    }

    /**
     * Return true if there is any brand new car.
     */
    public boolean isThereAnyBrandNewCar() {
        return cars.stream().anyMatch(Car::IsBrandNew);
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        AnyMatch anyMatch = new AnyMatch(dealerShip.getInventory());
        System.out.println(anyMatch.isThereAnyForeignCar() + "\n");
        System.out.println(anyMatch.isThereAnyJapaneseCar() + "\n");
        System.out.println(anyMatch.isThereAnyBrandNewCar() + "\n");
    }
}
