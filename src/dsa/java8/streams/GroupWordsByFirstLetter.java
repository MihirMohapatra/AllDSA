package dsa.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter  {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry", "apricot", "cranberry");

        words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)))
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
