import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        user arp = new user();
        arp.currency = "Argentine Peso";
        arp.value = 252.50;

        user aud = new user();
        aud.currency = "Australian Dollar";
        aud.value = 1.50;

        user euro = new user();
        euro.currency = "European Euro";
        euro.value = 1.09;

        user yen = new user();
        yen.currency = "Japanese Yen";
        yen.value = 143.70;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which currency would you like to convert?");
        String usd = scanner.nextLine();
        switch (usd) {
            case "Argentine Peso":
                arp.userPrint();
                break;
            case "Australian Dollar":
                aud.userPrint();
                break;
            case "European Euro":
                euro.userPrint();
                break;
            case "Japanese Yen":
                yen.userPrint();
                break;
        }
    }
}