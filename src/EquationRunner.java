
import java.util.Scanner;
import java.util.regex.*;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String regex = "(\\d{1})/(\\d{1})";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("What is your first pair of coordinates? ");
        String x = s.nextLine();
        Matcher matchPattern = pattern.matcher(x);
        System.out.println(matchPattern.group(1));

        System.out.print("What is your second pair of coordinates? ");
        String y = s.nextLine();

        System.out.print("What is your third x-coordinate? ");

    }

}
