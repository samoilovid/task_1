import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nb;
        int base;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести систему счисления: ");
        base = scanner.nextInt();
        System.out.println("Ввести значение: ");
        if (scanner.hasNextInt()) {
            nb = scanner.nextInt();
            BigInteger convertA = new BigInteger(String.valueOf(nb));
            BigInteger convertB = new BigInteger(convertA.toString(base));

            System.out.println(convertB);
        } else {
            System.out.println("Usage");
        }
    }
}
