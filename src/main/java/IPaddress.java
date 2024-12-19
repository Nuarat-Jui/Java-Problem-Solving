
import java.util.Scanner;
import java.util.regex.*;

public class IPaddress {
    public static void main(String[] args) {
        // each number in an ip adress ranges from upto 255.
        String pattern = "\\b(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d)\\." +
                "(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\." +
                "(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\." +
                "(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\b";

        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        String ip=input.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(ip);
        if (matcher.matches()) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
}
