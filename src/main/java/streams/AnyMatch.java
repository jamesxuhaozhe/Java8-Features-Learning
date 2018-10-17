package streams;

import car.Car;
import car.DealerShip;
import org.omg.CORBA.Any;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class AnyMatch {

    /**
     * Return true if there is any foreign made car.
     */
    public static boolean isThereAnyForeignCar(List<Car> cars) {
        return cars.stream().anyMatch(Car::isForeign);
    }

    /**
     * Return true if there is any Japanese car.
     */
    public static boolean isThereAnyJapaneseCar(List<Car> cars) {
        return cars.stream().anyMatch(car -> car.getCountry().equals("Japan"));
    }

    /**
     * Return true if there is any brand new car.
     */
    public static boolean isThereAnyBrandNewCar(List<Car> cars) {
        return cars.stream().anyMatch(Car::IsBrandNew);
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        System.out.println(AnyMatch.isThereAnyForeignCar(dealerShip.getInventory()) + "\n");
        System.out.println(AnyMatch.isThereAnyJapaneseCar(dealerShip.getInventory()) + "\n");
        System.out.println(AnyMatch.isThereAnyBrandNewCar(dealerShip.getInventory()) + "\n");
    }
}
