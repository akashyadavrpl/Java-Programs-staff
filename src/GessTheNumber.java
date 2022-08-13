
// import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class GessTheNumber {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int randomNumber = getRandomNumber(1, 100);
        // System.out.println("Ranodom no is: " + randomNumber);

        while (true) {

            System.out.println("Enter a no to gess the number ");

            int gessNumber = kb.nextInt();

            if (randomNumber == gessNumber) {
                System.out.println("Won");
                break;
            } else if (gessNumber > randomNumber) {
                System.out.println("High");
            } else {
                System.out.println("Low");
            }

        }
        kb.close();
        System.out.println("You are won! Thank's");
    }
}
