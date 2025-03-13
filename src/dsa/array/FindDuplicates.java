package dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6, 7, 8, 2, 4, 3, 3};

        Set<Integer> set = new HashSet<>();

        Object[] array = Arrays.stream(arr).boxed().filter(t -> !set.add(t)).toArray();
        System.out.println(Arrays.toString(array));
    }
}
