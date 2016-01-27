package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class Reduce {
    private List<Car> cars;

    public Reduce(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets the sum of all the vin number in dealership.
     */
    public int getSumOfVin() {
        return cars.stream().mapToInt(Car::getVin).reduce(0, (a, b) -> a + b);
    }

    /**
     * Gets the sum of all the vin number in dealership.
     */
    public int getSumOfYear() {
        return cars.stream().mapToInt(Car::getYear).reduce(0, (a, b) -> a + b);
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        Reduce reduce = new Reduce(dealerShip.getInventory());
        System.out.println(reduce.getSumOfVin() + "\n");
        System.out.println(reduce.getSumOfYear() + "\n");
    }
}
