/**
 * Created by opilane on 21.10.2016.
 */
import java.util.*;
import java.text.*;

public class exercise43 {
    public static void printAmerican() {
        Date dNow = new Date();
        SimpleDateFormat ftusa =
                new SimpleDateFormat("EEEEE, MMMMM dd, yyyy");

        System.out.println("USA aeg: ");
        ftusa.setTimeZone(TimeZone.getTimeZone("ECT"));
        System.out.println(ftusa.format(dNow));
    }

    public static void printEuropean() {
        Date dNow = new Date();
        SimpleDateFormat fteur =
                new SimpleDateFormat("EEEEE dd MMMMM yyyy");

        System.out.println("Euroopa aeg: ");
        fteur.setTimeZone(TimeZone.getTimeZone("EST"));
        System.out.println(fteur.format(dNow));
    }
    public static void vastus1() {
        String vastus1 = "Euroopa aeg: ";
    }
    public static void vastus2() {
        String vastus2 = "Ameerika aeg: ";
    }

    public static void main(String[] args) {
        vastus2();
        printAmerican();
        System.out.println();
        vastus1();
        printEuropean();
    }
}
