package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by haozhexu on 1/27/16.
 */
public class StreamGeneration {

    public static void main(final String[] args) {
        // Define primitive int stream
        IntStream intStream = IntStream.rangeClosed(1, 100).filter(x -> x % 10 == 0);
        System.out.println(intStream.sum());

        // Define static function within Stream
        Stream<String> stringStream = Stream.of("element1", "element2", "element3");
        stringStream.forEach(System.out::println);

        // Define IntStream using array
        IntStream intStreamFromArray = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(intStreamFromArray.sum());
    }
}
