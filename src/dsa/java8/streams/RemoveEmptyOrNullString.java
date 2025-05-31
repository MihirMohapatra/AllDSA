package dsa.java8.streams;

import java.util.Arrays;
import java.util.List;

public class RemoveEmptyOrNullString {
    public static void main(String[] args) {
        String[] str = {"abc", "", null, "def", "g"};

        List<String> result = Arrays.stream(str).filter(t -> t != null && !t.isEmpty()).toList();
        System.out.println(result);
    }
}
