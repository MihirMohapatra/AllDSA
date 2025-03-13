package dsa.array;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;

        int sum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
}
