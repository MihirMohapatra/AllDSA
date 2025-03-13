package dsa.array;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Abhishek", "Abhinab", "Abhi");
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(List<String> str) {

       if (str==null ||str.isEmpty()) return "";
       String prefix = str.getFirst();

        for (int i = 1; i < str.size(); i++) {
            while (str.get(i).indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix(String[] arr){
        int n= arr.length;
        String result= arr[0];

        for (int i = 0; i < n; i++) {
            while (arr[i].indexOf(result) != 0){
                result = result.substring(0, result.length()-1);
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;
    }
}
