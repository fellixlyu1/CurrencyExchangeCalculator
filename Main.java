import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        user arp = new user();
        arp.currency = CurrencyType.ARG_PESO;
        arp.value = 252.50;

        user aud = new user();
        aud.currency = CurrencyType.AUS_DOLLAR;
        aud.value = 1.50;

        user dinar = new user();
        dinar.currency = CurrencyType.BEH_DINAR;
        dinar.value = 0.38;

        user pula = new user();
        pula.currency = CurrencyType.BOT_PULA;
        pula.value = 13.32;

        user real = new user();
        real.currency = CurrencyType.BRA_REAL;
        real.value = 4.78;

        user pound = new user();
        pound.currency = CurrencyType.BRI_POUND;
        pound.value = 0.79;

        user bru = new user();
        bru.currency = CurrencyType.BRU_DOLLAR;
        bru.value = 1.35;

        user lev = new user();
        lev.currency = CurrencyType.BUL_LEV;
        lev.value = 1.79;

        user can = new user();
        can.currency = CurrencyType.CAN_DOLLAR;
        can.value = 1.32;

        user chilPeso = new user();
        chilPeso.currency = CurrencyType.CHIL_PESO;
        chilPeso.value = 806.28;

        user yuan = new user();
        yuan.currency = CurrencyType.CHI_YUAN;
        yuan.value = 7.18;

        user colPeso = new user();
        colPeso.currency = CurrencyType.COL_PESO;
        colPeso.value = 4154.79;

        user czech = new user();
        czech.currency = CurrencyType.CZECH_KORUNA;
        czech.value = 21.71;

        user dan = new user();
        dan.currency = CurrencyType.DAN_KRONE;
        dan.value = 6.84;

        user emir = new user();
        emir.currency = CurrencyType.EMI_DIRHAM;
        emir.value = 3.67;

        user euro = new user();
        euro.currency = CurrencyType.EURO;
        euro.value = 1.09;

        user hkd = new user();
        hkd.currency = CurrencyType.HKD;
        hkd.value = 7.83;

        user hForint = new user();
        hForint.currency = CurrencyType.HUN_FORINT;
        hForint.value = 339.77;

        user ice = new user();
        ice.currency = CurrencyType.ICE_KRONA;
        ice.value = 136.72;

        user rupee = new user();
        rupee.currency = CurrencyType.IND_RUPEE;
        rupee.value = 81.98;

        user rupiah = new user();
        rupiah.currency = CurrencyType.IND_RUPIAH;
        rupiah.value = 15026.78;

        user rial = new user();
        rial.currency = CurrencyType.IRAN_RIAL;
        rial.value = 42208.23;

        user shekel = new user();
        shekel.currency = CurrencyType.ISRAELI_SHEKEL;
        shekel.value = 3.63;

        user yen = new user();
        yen.currency = CurrencyType.JAP_YEN;
        yen.value = 143.70;

        user kaz = new user();
        kaz.currency = CurrencyType.KAZAK_TENGE;
        kaz.value = 448.26;

        user kuw = new user();
        kuw.currency = CurrencyType.KUWA_DINAR;
        kuw.value = 0.31;

        user lib = new user();
        lib.currency = CurrencyType.LIB_DINAR;
        lib.value = 4.80;

        user mal = new user();
        mal.currency = CurrencyType.MAL_RING;
        mal.value = 4.68;

        user mau = new user();
        mau.currency = CurrencyType.MAU_RUPEE;
        mau.value = 45.83;

        user mex = new user();
        mex.currency = CurrencyType.MEX_PESO;
        mex.value = 17.17;

        user nep = new user();
        nep.currency = CurrencyType.NEP_RUPEE;
        nep.value = 131.22;

        user nzd = new user();
        nzd.currency = CurrencyType.NZ_DOLLAR;
        nzd.value = 1.63;

        user nor = new user();
        nor.currency = CurrencyType.NOR_KRONE;
        nor.value = 10.82;

        user oma = new user();
        oma.currency = CurrencyType.OMA_RIAL;
        oma.value = 0.38;

        user pak = new user();
        pak.currency = CurrencyType.PAK_RUPEE;
        pak.value = 286.48;

        user phil = new user();
        phil.currency = CurrencyType.PHILL_PESO;
        phil.value = 55.70;

        user pol = new user();
        pol.currency = CurrencyType.POL_ZLOTY;
        pol.value = 4.07;

        user qat = new user();
        qat.currency = CurrencyType.QAT_RIYAL;
        qat.value = 3.64;

        user rom = new user();
        rom.currency = CurrencyType.ROM_NEW_LEU;
        rom.value = 4.55;

        user rus = new user();
        rus.currency = CurrencyType.RUSS_RUBLE;
        rus.value = 83.37;

        user sau = new user();
        sau.currency = CurrencyType.SA_RIYAL;
        sau.value = 3.75;

        user sing = new user();
        sing.currency = CurrencyType.SING_DOLLAR;
        sing.value = 1.35;

        user sar = new user();
        sar.currency = CurrencyType.SAR;
        sar.value = 18.71;

        user skw = new user();
        skw.currency = CurrencyType.SKW;
        skw.value = 1308.71;

        user sri = new user();
        sri.currency = CurrencyType.SRI_RUPEE;
        sri.value = 308.03;

        user swe = new user();
        swe.currency = CurrencyType.SWE_KRONA;
        swe.value = 10.68;

        user swf = new user();
        swf.currency = CurrencyType.SWISS_FRANC;
        swf.value = 0.90;

        user tai = new user();
        tai.currency = CurrencyType.TAI_NEWDOLLAR;
        tai.value = 31.02;

        user thai = new user();
        thai.currency = CurrencyType.THAI_BAHT;
        thai.value = 35.14;

        user tri = new user();
        tri.currency = CurrencyType.TRI_DOLLAR;
        tri.value = 6.79;

        user turk = new user();
        turk.currency = CurrencyType.TURK_LIRA;
        turk.value = 25.26;

        user ven = new user();
        ven.currency = CurrencyType.VEN_BOLIVAR;
        ven.value = 2743003.83;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which currency would you like to convert?");
        String usd = scanner.nextLine();
        HashMap<String, CurrencyType> inputToInternalType = new HashMap<>();
        inputToInternalType.put("Argentine Peso".toLowerCase(), CurrencyType.ARG_PESO);
        inputToInternalType.put("ARG".toLowerCase(), CurrencyType.ARG_PESO);
        inputToInternalType.put("Australian Dollar".toLowerCase(), CurrencyType.AUS_DOLLAR);
        inputToInternalType.put("AUS".toLowerCase(), CurrencyType.AUS_DOLLAR);
        inputToInternalType.put("Behrani Dinar".toLowerCase(), CurrencyType.BEH_DINAR);
        inputToInternalType.put("BEH".toLowerCase(), CurrencyType.BEH_DINAR);
        inputToInternalType.put("Botswana Pula".toLowerCase(), CurrencyType.BOT_PULA);
        inputToInternalType.put("BOT".toLowerCase(), CurrencyType.BOT_PULA);
        inputToInternalType.put("Brazilian Real".toLowerCase(), CurrencyType.BRA_REAL);
        inputToInternalType.put("BRA".toLowerCase(), CurrencyType.BRA_REAL);
        inputToInternalType.put("British Pound".toLowerCase(), CurrencyType.BRI_POUND);
        inputToInternalType.put("BRI".toLowerCase(), CurrencyType.BRI_POUND);
        inputToInternalType.put("Bruneian Dollar".toLowerCase(), CurrencyType.BRU_DOLLAR);
        inputToInternalType.put("BRU".toLowerCase(), CurrencyType.BRU_DOLLAR);
        inputToInternalType.put("Bulgarian Lev".toLowerCase(), CurrencyType.BUL_LEV);
        inputToInternalType.put("BUL".toLowerCase(), CurrencyType.BUL_LEV);
        inputToInternalType.put("Canadian Dollar".toLowerCase(), CurrencyType.CAN_DOLLAR);
        inputToInternalType.put("CAN".toLowerCase(), CurrencyType.CAN_DOLLAR);
        inputToInternalType.put("Chilean Peso".toLowerCase(), CurrencyType.CHIL_PESO);
        inputToInternalType.put("CHIL".toLowerCase(), CurrencyType.CHIL_PESO);
        inputToInternalType.put("Chinese Yuan Renminbi".toLowerCase(), CurrencyType.CHI_YUAN);
        inputToInternalType.put("CHIN".toLowerCase(), CurrencyType.CHI_YUAN);
        inputToInternalType.put("Colombian Peso".toLowerCase(), CurrencyType.COL_PESO);
        inputToInternalType.put("COL".toLowerCase(), CurrencyType.COL_PESO);
        inputToInternalType.put("Czech Koruna".toLowerCase(), CurrencyType.CZECH_KORUNA);
        inputToInternalType.put("CZE".toLowerCase(), CurrencyType.CZECH_KORUNA);
        inputToInternalType.put("Danish Krone".toLowerCase(), CurrencyType.DAN_KRONE);
        inputToInternalType.put("DAN".toLowerCase(), CurrencyType.DAN_KRONE);
        inputToInternalType.put("Emirati Dirham".toLowerCase(), CurrencyType.EMI_DIRHAM);
        inputToInternalType.put("EMI".toLowerCase(), CurrencyType.EMI_DIRHAM);
        inputToInternalType.put("European Euro".toLowerCase(), CurrencyType.EURO);
        inputToInternalType.put("EURO".toLowerCase(), CurrencyType.EURO);
        inputToInternalType.put("Hong Kong Dollar".toLowerCase(), CurrencyType.HKD);
        inputToInternalType.put("HKD".toLowerCase(), CurrencyType.HKD);
        inputToInternalType.put("Hungarian Forint".toLowerCase(), CurrencyType.HUN_FORINT);
        inputToInternalType.put("HUNG".toLowerCase(), CurrencyType.HUN_FORINT);
        inputToInternalType.put("Icelandic Krona".toLowerCase(), CurrencyType.ICE_KRONA);
        inputToInternalType.put("ICE".toLowerCase(), CurrencyType.ICE_KRONA);
        inputToInternalType.put("Indian Rupee".toLowerCase(), CurrencyType.IND_RUPEE);
        inputToInternalType.put("INDIA".toLowerCase(), CurrencyType.IND_RUPEE);
        inputToInternalType.put("Indonesian Rupiah".toLowerCase(), CurrencyType.IND_RUPIAH);
        inputToInternalType.put("INDO".toLowerCase(), CurrencyType.IND_RUPIAH);
        inputToInternalType.put("Iranian Rial".toLowerCase(), CurrencyType.IRAN_RIAL);
        inputToInternalType.put("Iran".toLowerCase(), CurrencyType.IRAN_RIAL);
        inputToInternalType.put("Israeli Shekel".toLowerCase(), CurrencyType.ISRAELI_SHEKEL);
        inputToInternalType.put("ISRAEL".toLowerCase(), CurrencyType.ISRAELI_SHEKEL);
        inputToInternalType.put("Japanese Yen".toLowerCase(), CurrencyType.JAP_YEN);
        inputToInternalType.put("JPY".toLowerCase(), CurrencyType.JAP_YEN);
        inputToInternalType.put("Kazakhstani Tenge".toLowerCase(), CurrencyType.KAZAK_TENGE);
        inputToInternalType.put("KAZ".toLowerCase(), CurrencyType.KAZAK_TENGE);
        inputToInternalType.put("Kuwaiti Dinar".toLowerCase(), CurrencyType.KUWA_DINAR);
        inputToInternalType.put("KUW".toLowerCase(), CurrencyType.KUWA_DINAR);
        inputToInternalType.put("Libyan Dinar".toLowerCase(), CurrencyType.LIB_DINAR);
        inputToInternalType.put("LIB".toLowerCase(), CurrencyType.LIB_DINAR);
        inputToInternalType.put("Malaysian Ringgit".toLowerCase(), CurrencyType.MAL_RING);
        inputToInternalType.put("MAL".toLowerCase(), CurrencyType.MAL_RING);
        inputToInternalType.put("Mauritian Rupee".toLowerCase(), CurrencyType.MAU_RUPEE);
        inputToInternalType.put("MAU".toLowerCase(), CurrencyType.MAU_RUPEE);
        inputToInternalType.put("Mexican Peso".toLowerCase(), CurrencyType.MEX_PESO);
        inputToInternalType.put("MEX".toLowerCase(), CurrencyType.MEX_PESO);
        inputToInternalType.put("Nepalese Rupee".toLowerCase(), CurrencyType.NEP_RUPEE);
        inputToInternalType.put("NEP".toLowerCase(), CurrencyType.NEP_RUPEE);
        inputToInternalType.put("New Zealand Dollar".toLowerCase(), CurrencyType.NZ_DOLLAR);
        inputToInternalType.put("NZD".toLowerCase(), CurrencyType.NZ_DOLLAR);
        inputToInternalType.put("Norwegian Krone".toLowerCase(), CurrencyType.NOR_KRONE);
        inputToInternalType.put("NOR".toLowerCase(), CurrencyType.NOR_KRONE);
        inputToInternalType.put("Omani Rial".toLowerCase(), CurrencyType.OMA_RIAL);
        inputToInternalType.put("OMA".toLowerCase(), CurrencyType.OMA_RIAL);
        inputToInternalType.put("Pakistani Rupee".toLowerCase(), CurrencyType.PAK_RUPEE);
        inputToInternalType.put("PAK".toLowerCase(), CurrencyType.PAK_RUPEE);
        inputToInternalType.put("Phillippine Peso".toLowerCase(), CurrencyType.PHILL_PESO);
        inputToInternalType.put("PHIL".toLowerCase(), CurrencyType.PHILL_PESO);
        inputToInternalType.put("Polish Zloty".toLowerCase(), CurrencyType.POL_ZLOTY);
        inputToInternalType.put("POL".toLowerCase(), CurrencyType.POL_ZLOTY);
        inputToInternalType.put("Qatari Riyal".toLowerCase(), CurrencyType.QAT_RIYAL);
        inputToInternalType.put("QAT".toLowerCase(), CurrencyType.QAT_RIYAL);
        inputToInternalType.put("Romanian New Leu".toLowerCase(), CurrencyType.ROM_NEW_LEU);
        inputToInternalType.put("ROM".toLowerCase(), CurrencyType.ROM_NEW_LEU);
        inputToInternalType.put("Russian Ruble".toLowerCase(), CurrencyType.RUSS_RUBLE);
        inputToInternalType.put("RUSS".toLowerCase(), CurrencyType.RUSS_RUBLE);
        inputToInternalType.put("Saudi Arabian Riyal".toLowerCase(), CurrencyType.SA_RIYAL);
        inputToInternalType.put("SAU".toLowerCase(), CurrencyType.SA_RIYAL);
        inputToInternalType.put("Singapore Dollar".toLowerCase(), CurrencyType.SING_DOLLAR);
        inputToInternalType.put("SING".toLowerCase(), CurrencyType.SING_DOLLAR);
        inputToInternalType.put("South African Rand".toLowerCase(), CurrencyType.SAR);
        inputToInternalType.put("SAR".toLowerCase(), CurrencyType.SAR);
        inputToInternalType.put("South Korean Won".toLowerCase(), CurrencyType.SKW);
        inputToInternalType.put("SKW".toLowerCase(), CurrencyType.SKW);
        inputToInternalType.put("Sri Lankan Rupee".toLowerCase(), CurrencyType.SRI_RUPEE);
        inputToInternalType.put("SRI".toLowerCase(), CurrencyType.SRI_RUPEE);
        inputToInternalType.put("Swedish Krona".toLowerCase(), CurrencyType.SWE_KRONA);
        inputToInternalType.put("SWE".toLowerCase(), CurrencyType.SWE_KRONA);
        inputToInternalType.put("Swiss Franc".toLowerCase(), CurrencyType.SWISS_FRANC);
        inputToInternalType.put("SWISS".toLowerCase(), CurrencyType.SWISS_FRANC);
        inputToInternalType.put("Taiwan New Dollar".toLowerCase(), CurrencyType.TAI_NEWDOLLAR);
        inputToInternalType.put("TAI".toLowerCase(), CurrencyType.TAI_NEWDOLLAR);
        inputToInternalType.put("Thai Baht".toLowerCase(), CurrencyType.THAI_BAHT);
        inputToInternalType.put("THAI".toLowerCase(), CurrencyType.THAI_BAHT);
        inputToInternalType.put("Trinidad Dollar".toLowerCase(), CurrencyType.TRI_DOLLAR);
        inputToInternalType.put("TRI".toLowerCase(), CurrencyType.TRI_DOLLAR);
        inputToInternalType.put("Turkish Lira".toLowerCase(), CurrencyType.TURK_LIRA);
        inputToInternalType.put("TURK".toLowerCase(), CurrencyType.TURK_LIRA);
        inputToInternalType.put("Venezuelan Bolivar".toLowerCase(), CurrencyType.VEN_BOLIVAR);
        inputToInternalType.put("VEN".toLowerCase(), CurrencyType.VEN_BOLIVAR);
        CurrencyType switchCon = inputToInternalType.get(usd.toLowerCase());
        switch (switchCon) {
            case ARG_PESO:
                arp.userPrint();
                break;
            case AUS_DOLLAR:
                aud.userPrint();
                break;
            case BEH_DINAR:
                dinar.userPrint();
                break;
            case BOT_PULA:
                pula.userPrint();
                break;
            case BRA_REAL:
                real.userPrint();
                break;
            case BRI_POUND:
                pound.userPrint();
                break;
            case BRU_DOLLAR:
                bru.userPrint();
                break;
            case BUL_LEV:
                lev.userPrint();
                break;
            case CAN_DOLLAR:
                can.userPrint();
                break;
            case CHIL_PESO:
                chilPeso.userPrint();
                break;
            case CHI_YUAN:
                yuan.userPrint();
                break;
            case COL_PESO:
                colPeso.userPrint();
                break;
            case CZECH_KORUNA:
                czech.userPrint();
                break;
            case DAN_KRONE:
                dan.userPrint();
                break;
            case EMI_DIRHAM:
                emir.userPrint();
                break;
            case EURO:
                euro.userPrint();
                break;
            case HKD:
                hkd.userPrint();
                break;
            case HUN_FORINT:
                hForint.userPrint();
                break;
            case ICE_KRONA:
                ice.userPrint();
                break;
            case IND_RUPEE:
                rupee.userPrint();
                break;
            case IND_RUPIAH:
                rupiah.userPrint();
                break;
            case IRAN_RIAL:
                rial.userPrint();
                break;
            case ISRAELI_SHEKEL:
                shekel.userPrint();
                break;
            case JAP_YEN:
                yen.userPrint();
                break;
            case KAZAK_TENGE:
                kaz.userPrint();
                break;
            case KUWA_DINAR:
                kuw.userPrint();
                break;
            case LIB_DINAR:
                lib.userPrint();
                break;
            case MAL_RING:
                mal.userPrint();
                break;
            case MAU_RUPEE:
                mau.userPrint();
                break;
            case MEX_PESO:
                mex.userPrint();
                break;
            case NEP_RUPEE:
                nep.userPrint();
                break;
            case NZ_DOLLAR:
                nzd.userPrint();
                break;
            case NOR_KRONE:
                nor.userPrint();
                break;
            case OMA_RIAL:
                oma.userPrint();
                break;
            case PAK_RUPEE:
                pak.userPrint();
                break;
            case PHILL_PESO:
                phil.userPrint();
                break;
            case POL_ZLOTY:
                pol.userPrint();
                break;
            case QAT_RIYAL:
                qat.userPrint();
                break;
            case ROM_NEW_LEU:
                rom.userPrint();
                break;
            case RUSS_RUBLE:
                rus.userPrint();
                break;
            case SA_RIYAL:
                sau.userPrint();
                break;
            case SING_DOLLAR:
                sing.userPrint();
                break;
            case SAR:
                sar.userPrint();
                break;
            case SKW:
                skw.userPrint();
                break;
            case SRI_RUPEE:
                sri.userPrint();
                break;
            case SWE_KRONA:
                swe.userPrint();
                break;
            case SWISS_FRANC:
                swf.userPrint();
                break;
            case TAI_NEWDOLLAR:
                tai.userPrint();
                break;
            case THAI_BAHT:
                thai.userPrint();
                break;
            case TRI_DOLLAR:
                tri.userPrint();
                break;
            case TURK_LIRA:
                turk.userPrint();
                break;
            case VEN_BOLIVAR:
                ven.userPrint();
                break;
        }
    }
}