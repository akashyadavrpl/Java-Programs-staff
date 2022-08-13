import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for factorial");
        int factorial = sc.nextInt();
        sc.close();
        Double newFact = 1.0;
        while (true) {
            if (factorial < 1) {
                break;
            }
            newFact *= factorial;
            factorial--;
        }
        System.out.println("Factorial is " + newFact);
    }
}
