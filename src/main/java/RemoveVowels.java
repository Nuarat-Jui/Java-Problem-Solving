import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        String ms=input.nextLine();
        char[] carr=ms.toCharArray();
        String newStr="";
        for(char i:carr) {
            if (Character.toLowerCase(i) != 'a' && Character.toLowerCase(i) != 'e' && Character.toLowerCase(i) != 'i' && Character.toLowerCase(i) != 'o' && Character.toLowerCase(i) != 'u') {
                newStr=newStr+i;
            }
        }
        String newS=newStr.trim();
        System.out.println("Output: "+newS);

    }
}
