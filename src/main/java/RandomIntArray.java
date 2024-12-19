import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomIntArray {
    public static void main(String[] args) {
        Integer[] arr=new Integer[10];
        for(int i=0;i<arr.length;i++){
            int rand=(int) Math.round(Math.random()*10);
            arr[i]=rand;
        }
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"\n");
            }
            else{
                System.out.print(arr[i]+" , ");
            }
        }
        List<Integer> arrList= Arrays.asList(arr);
        Integer max= Collections.max(arrList);
        Integer min= Collections.min(arrList);
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
