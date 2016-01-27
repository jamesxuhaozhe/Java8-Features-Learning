package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class NoneMatch {
    private List<Car> cars;

    public NoneMatch(List<Car> cars) {
        this.cars = cars;
    }

    public boolean areTheyAllForeignCars() {
        return cars.stream().noneMatch(car -> !car.isForeign());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        NoneMatch noneMatch = new NoneMatch(dealerShip.getInventory());
        System.out.println(noneMatch.areTheyAllForeignCars() + "\n");
    }
}
