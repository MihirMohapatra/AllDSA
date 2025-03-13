package dsa.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ThirdLongestWord {
    public static void main(String[] args) {
        String str = "mihir kumar mohapatra is a backend developer";

        List<String> limit = Arrays.stream(str.split(" "))
                .distinct() // Remove duplicates if needed
                .sorted(Comparator.comparingInt(String::length).reversed()
                        .thenComparing(Comparator.naturalOrder())).toList();

        System.out.println(limit);
    }
}
