package streams;

import car.Car;
import car.DealerShip;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Created by haozhexu on 1/27/16.
 */
public class MapAPI {
    private List<Car> cars;

    public MapAPI(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets vin numbers of all the dealership cars.
     */
    public List<Integer> getVins() {
        return cars.stream().map(Car::getVin).collect(toList());
    }

    /**
     * Gets countries of all the dealership cars.
     */
    public Set<String> getCountries() {
        return cars.stream().map(Car::getCountry).collect(toSet());
    }

    /**
     * Gets makes of all the dealership cars.
     */
    public Set<String> getMakes() {
        return cars.stream().map(Car::getMake).collect(toSet());
    }

    /**
     * Gets models of all the dealership cars.
     */
    public Set<String> getModels() {
        return cars.stream().map(Car::getModel).collect(toSet());
    }

    /**
     * Gets types of all the dealership cars.
     */
    public Set<String> getTypes() {
        return cars.stream().map(Car::getType).collect(toSet());
    }

    public static void main(final String[] args) {
        DealerShip dealerShip = new DealerShip();
        MapAPI mapAPI = new MapAPI(dealerShip.getInventory());
        System.out.println(mapAPI.getVins() + "\n");
        System.out.println(mapAPI.getCountries() + "\n");
        System.out.println(mapAPI.getMakes() + "\n");
        System.out.println(mapAPI.getModels() + "\n");
        System.out.println(mapAPI.getTypes() + "\n");
    }
}
