import java.util.Scanner;

public class CheckIfBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String num;
        System.out.print("Input: ");
        num= input.next();
        char[] binary=num.toCharArray();
        //System.out.println(Arrays.toString(binary));
        boolean result=true;
        for(char i:binary){
            if(i!='1' && i!='0'){
                result=false;
                break;
            }
        }
        if(result){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
