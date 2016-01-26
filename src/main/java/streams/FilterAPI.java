package streams;

import car.Car;
import car.DealerShip;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by haozhexu on 1/27/16.
 */
public class FilterAPI {
    private List<Car> cars;

    public FilterAPI(List<Car> cars) {
        this.cars = cars;
    }
    public List<Car> getRedCars() {
        return cars.stream().filter(car -> car.getColor().equals("Red")).collect(toList());
    }

    public List<Car> getForeignCars() {
        return cars.stream().filter(car -> car.isForeign() == true).collect(toList());
    }

    public List<Car> getJapaneseCars() {
        return cars.stream().filter(car -> car.getCountry().equals("Japan")).collect(toList());
    }

    public List<Car> getBrandNewCars() {
        return cars.stream().filter(car -> car.IsBrandNew() == true).collect(toList());
    }

    public List<Car> getUSCars() {
        return cars.stream().filter(car -> car.getCountry().equals("USA")).collect(toList());
    }

    public List<Car> getSedans() {
        return cars.stream().filter(car -> car.getType().equals("Sedan")).collect(toList());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        FilterAPI filterAPI = new FilterAPI(dealerShip.getInventory());
        System.out.println(filterAPI.getRedCars() + "\n");
        System.out.println(filterAPI.getForeignCars() + "\n");
        System.out.println(filterAPI.getJapaneseCars() + "\n");
        System.out.println(filterAPI.getBrandNewCars() + "\n");
        System.out.println(filterAPI.getUSCars() + "\n");
        System.out.println(filterAPI.getSedans() + "\n");
    }
}
