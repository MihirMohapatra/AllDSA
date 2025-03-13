package dsa.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MapAndFlatMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "mango", "orange");
        List<String> mapList = list.stream().map(String::toUpperCase).toList();


        List< List<String>> faltList = Arrays.asList(
                Arrays.asList("apple", "mango"),
                Arrays.asList("orange", "jack fruit"),
                Arrays.asList("grapes", "Kiwi")
        );

        List<String> FlatenList = faltList.stream().flatMap(List::stream)
                .map(String::toUpperCase)
                .toList();
    }
}
