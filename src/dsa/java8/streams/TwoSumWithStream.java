package dsa.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoSumWithStream {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, -2, 9};
        int target = 9;

        List<int[]> result = IntStream.range(0, nums.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> nums[i] + nums[j] == target)
                        .mapToObj(j -> new int[]{i, j}))
                .toList();

        if (result.isEmpty()) {
            System.out.println("No two sum pairs found.");
        } else {
            System.out.println("Matching index pairs:");
            result.forEach(pair -> System.out.println(Arrays.toString(pair)));
        }
    }
}
