public class ArraySort {
    public static void main(String[] args) {
        double[] arr={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for(int i=0;i<arr.length-1;i++){
            double f=arr[i];
            for(int j=i+1;j<arr.length;j++) {
                if (f < arr[j]) {
                    double t = arr[j];
                    f = f + t;
                    t = f - t;
                    f = f - t;
                    arr[i] = f;
                    arr[j] = t;
                }
            }
        }
        System.out.println("Sorted Array according to the order of highest CGPA");
        for(double r:arr){
            System.out.printf("%.2f  ",r);
        }
    }

}
