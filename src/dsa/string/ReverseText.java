package dsa.string;

public class ReverseText {
    public static void main(String[] args) {

        String str = "hello";
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < str.length()/2; i++) {
            temp = chars[i];
            chars[i] = chars[str.length()-1 -i];
            chars[str.length()-1 -i] = temp;
        }

        System.out.println(String.valueOf(chars));

    }
}
