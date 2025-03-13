package dsa.array;

public class LargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int number : arr){
            if(number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest: " + largest + " Smallest: " + smallest);
    }
}
