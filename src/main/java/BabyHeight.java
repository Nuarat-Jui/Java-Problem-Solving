import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BabyHeight {
    public static void main(String[] args) {
        Integer[] arr=new Integer[10];
        Scanner input=new Scanner(System.in);
        int h;
        System.out.println("Enter 10 heights > ");
        for(int i=0;i<10;i++){
            h= input.nextInt();
            arr[i]=h;
        }
        List<Integer> alist= Arrays.asList(arr);
        int min1= Collections.min(alist);
        System.out.println("First min:"+min1);
        int min2=Collections.max(alist);//gives error for 0 or arr[0]
        for(int min:arr){
            if(min>min1 && min<min2){
                min2=min;
            }
        }
        System.out.println("Second min:"+min2);
    }
}
