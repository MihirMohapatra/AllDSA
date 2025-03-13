package dsa.string;

public class FindAllSubString {

    public static void main(String[] args) {
        String s = "abcd";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String str =s.substring(i, j);
                System.out.println(str);
            }
        }
    }
}
