import java.util.Scanner;

public class FeranToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (32°F − 32) × 5/9 = 0°C

        System.out.println("Enter a *F ");
        double fern = sc.nextDouble();
        sc.close();

        Double calCel = (fern - 32) * 5 / 9;

        System.out.println("*C is " + calCel);

    }
}
