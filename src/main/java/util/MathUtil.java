package util;

import java.util.stream.IntStream;

/**
 * Created by haozhexu on 1/27/16.
 */
public class MathUtil {

    public static boolean isPrime(int n) {
        int candidateRoot = (int) Math.sqrt((double) n);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> n % i == 0);
    }
}
