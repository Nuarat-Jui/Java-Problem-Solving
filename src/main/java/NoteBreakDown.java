import java.util.Scanner;

public class NoteBreakDown {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        int amount=input.nextInt();
        System.out.println("Output:");
        for (int note:notes) {
            if (amount>=note) {
                int c=amount/note;
                amount=amount%note;
                System.out.println(note+" "+c);
            }
        }
    }
}
