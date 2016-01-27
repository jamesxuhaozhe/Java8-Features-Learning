package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class AllMatch {
    private List<Car> cars;

    public AllMatch(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Return true if all the dealership cars are foreign made.
     */
    public boolean areTheyAllForeignCars() {
        return cars.stream().allMatch(car -> car.isForeign());
    }

    /**
     * Return true if all the dealership cars are red.
     */
    public boolean areTheyAllRed() {
        return cars.stream().allMatch(car -> car.getColor().equals("Red"));
    }

    /**
     * Return true if all the dealership cars are brand new.
     */
    public boolean areTheyAllBrandNew() {
        return cars.stream().allMatch(car -> car.IsBrandNew());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        AllMatch allMatch = new AllMatch(dealerShip.getInventory());
        System.out.println(allMatch.areTheyAllForeignCars() + "\n");
        System.out.println(allMatch.areTheyAllRed() + "\n");
        System.out.println(allMatch.areTheyAllBrandNew() + "\n");
    }
}
