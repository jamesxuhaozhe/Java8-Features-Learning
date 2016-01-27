package streams;

import car.Car;
import car.DealerShip;
import util.MathUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
/**
 * Created by haozhexu on 1/27/16.
 */
public class CollectorMisc {
    private List<Car> cars = new DealerShip().getInventory();

    public void testMaxBy() {
        Comparator<Car> carComparator = comparingInt(Car::getYear);
        Optional<Car> latestCar = cars.stream().collect(maxBy(carComparator));
        System.out.println(latestCar.orElse(null) + "\n");
    }

    public void testJoining() {
        String combinedCountryStr = cars.stream().map(Car::getCountry).collect(joining(", "));
        System.out.println(combinedCountryStr + "\n");
    }

    public void testGroupingBy() {
        Map<String, List<Car>> groupByCountry = cars.stream().collect(groupingBy(Car::getCountry));
        System.out.println(groupByCountry + "\n");
    }

    public void testReducing() {
        int reducingToNum = cars.stream().collect(reducing(0, Car::getYear, Integer::sum));
        System.out.println(reducingToNum + "\n");
    }

    public void testMultiLevelGroupingBy() {
        Map<String, Map<String, List<Car>>> multiGroupBy = cars.stream()
                .collect(groupingBy(Car::getCountry, groupingBy(Car::getType)));
        System.out.println(multiGroupBy + "\n");
    }

    public void testGroupingByandMaxBy() {
        Map<String, Optional<Car>> result = cars.stream().collect(groupingBy(Car::getCountry, maxBy(comparingInt(Car::getYear))));
        System.out.println(result + "\n");
    }

    public void testPartitioning() {
        Map<Boolean, List<Car>> foreignCarMap = cars.stream().collect(partitioningBy(Car::isForeign));
        System.out.println(foreignCarMap + "\n");
    }

    public void testComboPartioningAndThenGroupingBy() {
        Map<Boolean, Map<String, List<Car>>> result = cars.stream()
                .collect(partitioningBy(Car::isForeign, groupingBy(Car::getCountry)));
        System.out.println(result + "\n");
    }

    public void testPartitionPrime(int n) {
        Map<Boolean, List<Integer>> primePartition = IntStream.rangeClosed(1, n)
                                                              .boxed()
                                                              .collect(partitioningBy(MathUtil::isPrime));
        System.out.println(primePartition + "\n");
    }

    public static void main(final String[] args) {
        CollectorMisc me = new CollectorMisc();
        me.testMaxBy();
        me.testJoining();
        me.testGroupingBy();
        me.testReducing();
        me.testMultiLevelGroupingBy();
        me.testGroupingByandMaxBy();
        me.testPartitioning();
        me.testComboPartioningAndThenGroupingBy();
        me.testPartitionPrime(100);
    }
}
