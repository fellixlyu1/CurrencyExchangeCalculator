import java.util.Scanner;

public class user {
        String currency;
        double value;
        void userPrint() {
            Scanner amount = new Scanner(System.in);
            System.out.println("Amount being converted:");
            int conversionAmount = amount.nextInt();
            double total = conversionAmount * value;
            System.out.println(conversionAmount + " USD amounts to " + total + " " + currency);
    }
}