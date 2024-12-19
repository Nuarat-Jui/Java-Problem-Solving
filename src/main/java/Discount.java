import java.sql.SQLOutput;

public class Discount {
    public static void main(String[] args) {
        String str="A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String[] arr=str.split(" ");
        double laptopPrize=Double.parseDouble(arr[1]);
        double mousePrize=Double.parseDouble(arr[2]);
        double vat=Double.parseDouble(arr[4]);
        double tp=laptopPrize+mousePrize;
        double dp=tp-(tp*(vat/100));
        System.out.printf("Total prize after discount : %.2f",dp);
        System.out.println();
    }
}
