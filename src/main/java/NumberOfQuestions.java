public class NumberOfQuestions {
    public static void main(String[] args) {
        int tq=15;
        int tn=100;
        int x,y;
        /*x+y=15
         *5x+10y=100
         */
        y=(tn-(5*tq))/5;
        x=15-y;
        System.out.println("5 marks question is "+x);
        System.out.println("10 marks question is "+y);
    }
}
