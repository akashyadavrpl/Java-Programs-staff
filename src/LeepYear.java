import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a year ");

        int year = kb.nextInt();

        // if (year % 400 == 0) {
        // System.out.println(year + " is leap year");
        // } else if (year % 4 == 0 && year % 100 != 0) {
        // System.out.println(year + " is a leap year");
        // } else {
        // System.out.println(year + " is not leap year");
        // }

        // : More accurate code

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        kb.close();
    }
}
