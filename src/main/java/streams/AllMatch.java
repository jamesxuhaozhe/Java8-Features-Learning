package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * A class that demonstrates allMatch functions
 * Created by haozhexu on 1/27/16.
 */
public class AllMatch {
    /**
     * Return true if all the dealership cars are foreign made.
     */
    public static boolean areTheyAllForeignCars(final List<Car> cars) {
        return cars.stream().allMatch(car -> car.isForeign());
    }

    /**
     * Return true if all the dealership cars are red.
     */
    public static boolean areTheyAllRed(List<Car> cars) {
        return cars.stream().allMatch(car -> car.getColor().equals("Red"));
    }

    /**
     * Return true if all the dealership cars are brand new.
     */
    public static boolean areTheyAllBrandNew(List<Car> cars) {
        return cars.stream().allMatch(car -> car.IsBrandNew());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        System.out.println(AllMatch.areTheyAllForeignCars(dealerShip.getInventory()) + "\n");
        System.out.println(AllMatch.areTheyAllRed(dealerShip.getInventory()) + "\n");
        System.out.println(AllMatch.areTheyAllBrandNew(dealerShip.getInventory()) + "\n");
    }
}
