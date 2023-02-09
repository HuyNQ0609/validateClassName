import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//      ClassNameExample classNameExample = new ClassNameExample();
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z][0-9]{4}[G-M]$");
        while (true) {
            System.out.println("Enter class name: ");
            String className = input.nextLine();
            Matcher matcher = pattern.matcher(className);
            if (matcher.find() && (className.startsWith("C") || className.startsWith("A")
                                    || className.startsWith("P")))
            {
                System.out.println(className + " is true.");
                break;
            } else {
                System.out.println(className + " is false.");
            }
        }
    }
}