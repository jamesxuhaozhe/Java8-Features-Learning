package car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/26/16.
 */
public class DealerShip {

    /**
     * Data structure to hold cars in the dealership.
     */
    private List<Car> inventory;

    public DealerShip() {
        inventory = new ArrayList<>();
        fillInventory();
    }

    public List<Car> getInventory() {
        return inventory;
    }
    private void fillInventory() {
        Car car1 = new Car("Honda", "Japan", "Accord", "Black", "Sedan", 1001, 2014, true, true);
        Car car2 = new Car("Toyota", "Japan", "Camry", "White", "Sedan", 1002, 2014, true, true);
        Car car3 = new Car("Ford", "USA", "Focus", "Yellow", "Sedan", 1005, 2015, true, false);
        Car car4 = new Car("Chevy", "USA", "Camario", "Blue", "Coupe", 1000, 2016, true, false);
        Car car5 = new Car("Ford", "USA", "Mustang", "Red", "Coupe", 999, 2010, false, false);
        Car car6 = new Car("BMW", "Germany", "X6", "Black", "SUV", 998, 2013, false, true);
        Car car7 = new Car("Benz", "Germany", "MLk300", "Red", "SUV", 900, 2014, false, true);
        addCar(car1).addCar(car2).addCar(car3).addCar(car4).addCar(car5).addCar(car6).addCar(car7);
    }

    private DealerShip addCar(Car car) {
        this.inventory.add(car);
        return this;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }
}
