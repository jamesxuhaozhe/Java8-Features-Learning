package streams;

import car.Car;
import car.DealerShip;

import java.util.List;

/**
 * Created by haozhexu on 1/27/16.
 */
public class Misc {
    private List<Car> cars;

    public Misc(List<Car> cars) {
        this.cars = cars;
    }

    public int getYearSum() {
        return cars.stream().mapToInt(Car::getYear).sum();
    }

    public int getMinYear() {
        return cars.stream().mapToInt(Car::getYear).min().orElse(0);
    }

    public int getMaxYear() {
        return cars.stream().mapToInt(Car::getYear).max().orElse(0);
    }

    public int getDistinctCountries() {
        return (int) cars.stream().map(Car::getCountry).distinct().count();
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        Misc misc = new Misc(dealerShip.getInventory());
        System.out.println(misc.getYearSum() + "\n");
        System.out.println(misc.getMinYear() + "\n");
        System.out.println(misc.getMaxYear() + "\n");
        System.out.println(misc.getDistinctCountries() + "\n");
    }
}
