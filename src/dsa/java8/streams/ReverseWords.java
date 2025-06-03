package dsa.java8.streams;

import java.util.Arrays;


public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World Java Programming";
        String sentences = Arrays.stream(sentence.split(" "))
                .reduce((a, b) -> b + " " + a).orElse("");
        System.out.println(sentences);
    }
}
