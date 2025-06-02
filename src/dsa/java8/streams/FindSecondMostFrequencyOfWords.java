package dsa.java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondMostFrequencyOfWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hi", "PERE", "bye", "PERE", "goodbye", "PERE", "welcome", "PERe", "Hi", "There", "pere", "bye", "bye", "PeRE");

        TreeMap<String, Long> collect = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).
                skip(1).findFirst().ifPresent(System.out::println);
    }
}
