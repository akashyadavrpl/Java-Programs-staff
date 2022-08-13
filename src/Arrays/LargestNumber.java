package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] num = { 12, 2, 34, 4, 56, 67, 34, 2, 23 };
        int largest = Math.min(0, -100);
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("Largest num is: " + largest);
        System.out.println("Sum of all num is: " + sum);
    }
}
