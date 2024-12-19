import java.util.HashSet;
import java.util.Random;

public class GeneratePassword {
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String special = "!@#$%^*()-_=+[]{}|;:<>?/";

        Random rand = new Random();
        HashSet<Character> pass = new HashSet<>();

        pass.add(uppercase.charAt(rand.nextInt(uppercase.length())));
        pass.add(lowercase.charAt(rand.nextInt(lowercase.length())));
        pass.add(digit.charAt(rand.nextInt(digit.length())));
        pass.add(special.charAt(rand.nextInt(special.length())));

        String str = uppercase + lowercase + digit + special;
        while (pass.size() < 8) {
            pass.add(str.charAt(rand.nextInt(str.length())));
        }

        StringBuilder password = new StringBuilder();
        for (Character c : pass) {
            password.append(c);
        }
        System.out.println(password);
    }
}
