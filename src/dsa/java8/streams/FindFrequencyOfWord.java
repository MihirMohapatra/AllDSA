package dsa.java8.streams;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfWord {
    public static void main(String[] args) {

        String words = " Hi PERE bye PERE goodbye PERE welcome PERe Hi There pere bye bye PeRE";

        TreeMap<String, Long> collect = Arrays.stream(words.trim().split("\\s+"))
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
