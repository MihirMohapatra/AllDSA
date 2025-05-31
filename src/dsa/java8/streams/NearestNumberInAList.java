package dsa.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NearestNumberInAList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int target = 34;

        Optional<Integer> closest = numbers.stream().min(Comparator.comparing(n -> Math.abs(n - target)));

        closest.ifPresent(n -> System.out.println("closest number: " + n));

    }
}
