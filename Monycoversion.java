
/**
 * Monycoversion
 */
import java.util.*;

public class Monycoversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("┌────────────────────────────────┐");
        System.out.println("│ Welcome,Money conversion, Java App !                       ");
        System.out.println("└────────────────────────────────┘");

        System.out.println("*****************************************************************************");
        System.out.println("||                                                                         ||");
        System.out.println("|| This Code Help To Convert Indian Ruppes 10 Diffrent Contries Currency ! ||");
        System.out.println("||                                                                         ||");
        System.out.println("*****************************************************************************");
        System.out.println("Enter Your Mony in INR Rs.: ");
        double usermoney = sc.nextDouble();

        if (usermoney == 0) {
            System.out.println("Invalid input: The entered amount cannot be 0.");
            return;
        }

        double uscr = usermoney / 83.21;
        double ukcr = usermoney / 100.40;
        double eurocr = usermoney / 87.06;
        double chicr = usermoney / 11.37;
        double swfcr = usermoney / 90.49;
        double ruscr = usermoney / 0.83;
        double twncr = usermoney / 2.57;
        double uaecr = usermoney / 22.65;
        double japcr = usermoney / 0.56;

        String usa = String.format("%10.2f ", uscr);
        String UK = String.format("%10.2f ", ukcr);
        String EURO = String.format("%10.2f ", eurocr);
        String CHIYAN = String.format("%10.2f ", chicr);
        String JAPAN = String.format("%10.2f ", japcr);
        String SWF = String.format("%10.2f ", swfcr);
        String RUSS = String.format("%10.2f ", ruscr);
        String TWD = String.format("%10.2f ", twncr);
        String UAE = String.format("%10.2f ", uaecr);

        Currency us = Currency.getInstance(Locale.US);
        Currency uk = Currency.getInstance(Locale.UK);
        Currency euro = Currency.getInstance("EUR");
        Currency chi = Currency.getInstance(Locale.CHINA);
        Currency jap = Currency.getInstance("JPY");
        Currency swf = Currency.getInstance("CHF");
        Currency rus = Currency.getInstance("RUB");
        Currency twn = Currency.getInstance(Locale.TAIWAN);
        Currency uae = Currency.getInstance("AED");

        System.out.println(us.getDisplayName() + usa + us.getSymbol(Locale.US));
        System.out.println(uk.getDisplayName() + UK + uk.getSymbol(Locale.UK));
        System.out.println(euro + euro.getDisplayName() + EURO + euro.getSymbol());
        System.out.println(chi + chi.getDisplayName() + CHIYAN + chi.getSymbol(Locale.CHINA));
        System.out.println(jap + jap.getDisplayName() + JAPAN + jap.getSymbol(Locale.CHINA));
        System.out.println(swf.getDisplayName() + SWF + swf.getSymbol(Locale.UK));
        System.out.println(rus.getDisplayName() + RUSS + rus.getSymbol(Locale.UK));

        System.out.println(twn.getDisplayName() + TWD + twn.getSymbol(Locale.US));
        System.out.println(uae.getDisplayName() + UAE + uae.getSymbol(Locale.US));
        System.out.println("*****************************************************************************");
        System.out.println("|| Programming By, #TusharBhagat !                                         ||");
        System.out.println("*****************************************************************************");

        // sc.close();
    }
}