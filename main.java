import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        user arp = new user();
        arp.currency = "Argentine Peso";
        arp.value = 252.50;

        user aud = new user();
        aud.currency = "Australian Dollar";
        aud.value = 1.50;

        user dinar = new user();
        dinar.currency = "Bahraini Dinar";
        dinar.value = 0.38;

        user pula = new user();
        pula.currency = "Botswana Pula";
        pula.value = 13.32;

        user real = new user();
        real.currency = "Brazilian Real";
        real.value = 4.78;

        user pound = new user();
        pound.currency = "British Pound";
        pound.value = 0.79;

        user bru = new user();
        bru.currency = "Bruneian Dollar";
        bru.value = 1.35;

        user lev = new user();
        lev.currency = "Bulgarian Lev";
        lev.value = 1.79;

        user can = new user();
        can.currency = "Canadian Dollar";
        can.value = 1.32;

        user chilPeso = new user();
        chilPeso.currency = "Chilean Peso";
        chilPeso.value = 806.28;

        user yuan = new user();
        yuan.currency = "Chinese Yuan Renminbi";
        yuan.value = 7.18;

        user colPeso = new user();
        colPeso.currency = "Colombian Peso";
        colPeso.value = 4154.79;

        user czech = new user();
        czech.currency = "Czech Koruna";
        czech.value = 21.71;

        user dan = new user();
        dan.currency = "Danish Krone";
        dan.value = 6.84;

        user emir = new user();
        emir.currency = "Emirati Dirham";
        emir.value = 3.67;

        user euro = new user();
        euro.currency = "European Euro";
        euro.value = 1.09;

        user hkd = new user();
        hkd.currency = "Hong Kong Dollar";
        hkd.value = 7.83;

        user hForint = new user();
        hForint.currency = "Hungarian Forint";
        hForint.value = 339.77;

        user ice = new user();
        ice.currency = "Icelandic Krona";
        ice.value = 136.72;

        user rupee = new user();
        rupee.currency = "Indian Rupee";
        rupee.value = 81.98;

        user rupiah = new user();
        rupiah.currency = "Indonesian Rupiah";
        rupiah.value = 15026.78;

        user rial = new user();
        rial.currency = "Iranian Rial";
        rial.value = 42208.23;

        user shekel = new user();
        shekel.currency = "Israeli Shekel";
        shekel.value = 3.63;

        user yen = new user();
        yen.currency = "Japanese Yen";
        yen.value = 143.70;

        user kaz = new user();
        kaz.currency = "Kazakhstani Tenge";
        kaz.value = 448.26;

        user kuw = new user();
        kuw.currency = "Kuwaiti Dinar";
        kuw.value = 0.31;

        user lib = new user();
        lib.currency = "Libyan Dinar";
        lib.value = 4.80;

        user mal = new user();
        mal.currency = "Malaysian Ringgit";
        mal.value = 4.68;

        user mau = new user();
        mau.currency = "Mauritian Rupee";
        mau.value = 45.83;

        user mex = new user();
        mex.currency = "Mexican Peso";
        mex.value = 17.17;

        user nep = new user();
        nep.currency = "Nepalese Rupee";
        nep.value = 131.22;

        user nzd = new user();
        nzd.currency = "New Zealand Dollar";
        nzd.value = 1.63;

        user nor = new user();
        nor.currency = "Norwegian Krone";
        nor.value = 10.82;

        user oma = new user();
        oma.currency = "Omani Rial";
        oma.value = 0.38;

        user pak = new user();
        pak.currency = "Pakistani Rupee";
        pak.value = 286.48;

        user phil = new user();
        phil.currency = "Phillippine Peso";
        phil.value = 55.70;

        user pol = new user();
        pol.currency = "Polish Zloty";
        pol.value = 4.07;

        user qat = new user();
        qat.currency = "Qatari Riyal";
        qat.value = 3.64;

        user rom = new user();
        rom.currency = "Romanian New Leu";
        rom.value = 4.55;

        user rus = new user();
        rus.currency = "Russian Ruble";
        rus.value = 83.37;

        user sau = new user();
        sau.currency = "Saudi Arabian Riyal";
        sau.value = 3.75;

        user sing = new user();
        sing.currency = "Singapore Dollar";
        sing.value = 1.35;

        user sar = new user();
        sar.currency = "South African Rand";
        sar.value = 18.71;

        user skw = new user();
        skw.currency = "South Korean Won";
        skw.value = 1308.71;

        user sri = new user();
        sri.currency = "Sri Lankan Rupee";
        sri.value = 308.03;

        user swe = new user();
        swe.currency = "Swedish Krona";
        swe.value = 10.68;

        user swf = new user();
        swf.currency = "Swiss Franc";
        swf.value = 0.90;

        user tai = new user();
        tai.currency = "Taiwan New Dollar";
        tai.value = 31.02;

        user thai = new user();
        thai.currency = "Thai Baht";
        thai.value = 35.14;

        user tri = new user();
        tri.currency = "Trinidadian Dollar";
        tri.value = 6.79;

        user turk = new user();
        turk.currency = "Turkish Lira";
        turk.value = 25.26;

        user ven = new user();
        ven.currency = "Venezuelan Bolivar";
        ven.value = 2743003.83;

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
            case "Bahraini Dinar":
                dinar.userPrint();
                break;
            case "Botswana Pula":
                pula.userPrint();
                break;
            case "Brazilian Real":
                real.userPrint();
                break;
            case "British Pound":
                pound.userPrint();
                break;
            case "Bruneian Dollar" :
                bru.userPrint();
                break;
            case "Bulgarian Lev":
                lev.userPrint();
                break;
            case "Canadian Dollar":
                can.userPrint();
                break;
            case "Chilean Peso":
                chilPeso.userPrint();
                break;
            case "Chinese Yuan Renminbi":
                yuan.userPrint();
                break;
            case "Colombian Peso":
                colPeso.userPrint();
                break;
            case "Czech Koruna":
                czech.userPrint();
                break;
            case "Danish Krone":
                dan.userPrint();
                break;
            case "Emirati Dirham":
                emir.userPrint();
                break;
            case "European Euro":
                euro.userPrint();
                break;
            case "Hong Kong Dollar":
                hkd.userPrint();
                break;
            case "Hungarian Forint":
                hForint.userPrint();
                break;
            case "Icelandic Krona":
                ice.userPrint();
                break;
            case "Indian Rupee":
                rupee.userPrint();
                break;
            case "Indonesian Rupiah":
                rupiah.userPrint();
                break;
            case "Iranian Rial":
                rial.userPrint();
                break;
            case "Israeli Shekel":
                shekel.userPrint();
                break;
            case "Japanese Yen":
                yen.userPrint();
                break;
            case "Kazakhstani Tenge":
                kaz.userPrint();
                break;
            case "Kuwaiti Dinar":
                kuw.userPrint();
                break;
            case "Libyan Dinar":
                lib.userPrint();
                break;
            case "Malaysian Ringgit":
                mal.userPrint();
                break;
            case "Mauritian Rupee":
                mau.userPrint();
                break;
            case "Mexican Peso":
                mex.userPrint();
                break;
            case "Nepalese Rupee":
                nep.userPrint();
                break;
            case "New Zealand Dollar":
                nzd.userPrint();
                break;
            case "Norwegian Krone":
                nor.userPrint();
                break;
            case "Omani Rial":
                oma.userPrint();
                break;
            case "Pakistani Rupee":
                pak.userPrint();
                break;
            case "Phillippine Peso":
                phil.userPrint();
                break;
            case "Polish Zloty":
                pol.userPrint();
                break;
            case "Qatari Riyal":
                qat.userPrint();
                break;
            case "Romanian New Leu":
                rom.userPrint();
                break;
            case "Russian Ruble":
                rus.userPrint();
                break;
            case "Saudi Arabian Riyal":
                sau.userPrint();
                break;
            case "Singapore Dollar":
                sing.userPrint();
                break;
            case "South African Rand":
                sar.userPrint();
                break;
            case "South Korean Won":
                skw.userPrint();
                break;
            case "Sri Lankan Rupee":
                sri.userPrint();
                break;
            case "Swedish Krona":
                swe.userPrint();
                break;
            case "Swiss Franc":
                swf.userPrint();
                break;
            case "Taiwan New Dollar":
                tai.userPrint();
                break;
            case "Thai Baht":
                thai.userPrint();
                break;
            case "Trinidadian Dollar":
                tri.userPrint();
                break;
            case "Turkish Lira":
                turk.userPrint();
                break;
            case "Venezuelan Bolivar":
                ven.userPrint();
                break;
        }
    }
}