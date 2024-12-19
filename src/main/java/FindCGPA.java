import java.util.Arrays;
import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        Arrays.sort(cgpa);

        Scanner input = new Scanner(System.in);
        double cgpa_in;

        System.out.print("Enter a CGPA: ");
        cgpa_in= input.nextDouble();


        int left = 0;
        int right = cgpa.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == cgpa_in) {
                System.out.printf("CGPA: %.2f is found", cgpa[mid]);
                found = true;
                break;
            } else if (cgpa[mid] < cgpa_in) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.printf("CGPA: %.2f not found", cgpa_in);
        }
    }

}
