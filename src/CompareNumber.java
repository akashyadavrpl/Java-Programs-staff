
import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a 2 int number ");

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " is equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is grater then " + num2);
        } else {
            System.out.println(num1 + " is less then " + num2);
        }
        kb.close();
    }
}
