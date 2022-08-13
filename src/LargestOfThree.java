import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter 1st no ");
        int n1 = kb.nextInt();
        System.out.println("Enter 2nd no ");
        int n2 = kb.nextInt();
        System.out.println("Enter 3rd no ");
        int n3 = kb.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is grater");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is grater");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is grater");
        } else {
            System.out.println(n1 + " " + n2 + " " + n3 + " is equal");
        }
        kb.close();
    }
}
