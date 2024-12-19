public class SecondHighest {
    public static void main(String[] args) {
        double[] arr = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max1=arr[0];
        double max2=0; //if the 1st number is biggest then an issue arises for max2=arr[0]
        boolean b=true;
        double same=arr[0];
        for(double j:arr){
            if(max1<j){
                max2=max1;
                max1=j;
            }
            else if(max2<j && j<max1){
                max2=j;
            }
            //if all values are same or not
            if(same!=j){
                b=false;
            }
        }
        if(b){
            System.out.println("no 2nd max");
        }
        else{
            System.out.printf("Second highest : %.2f",max2);
        }
    }
}
