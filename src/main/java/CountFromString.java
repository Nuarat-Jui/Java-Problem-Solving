import java.util.Scanner;

public class CountFromString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        String ms=input.nextLine();
        String[] arr=ms.split(" ");
        System.out.println("Words: "+arr.length);
        char[] carr=ms.toCharArray();
        //System.out.println(Arrays.toString(carr));
        int v=0;
        int c=0;
        for(char i:carr){
            if(Character.toLowerCase(i)=='a' || Character.toLowerCase(i)=='e' || Character.toLowerCase(i)=='i' || Character.toLowerCase(i)=='o' || Character.toLowerCase(i)=='u'){
                v+=1;
            }
            else if(i!=' '){
                c+=1;
            }
        }
        int ch=v+c;
        System.out.println("Chars: "+ch);
        System.out.println("Vowel: "+v);
        System.out.println("Consonant: "+c);

    }
}
