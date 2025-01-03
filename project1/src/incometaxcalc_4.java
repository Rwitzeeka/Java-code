import java.util.Scanner;
public class incometaxcalc_4 {
    public static void main(String[] args) {
        //ques 3 income tax

        System.out.println("Enter your annual income in LPA: ");
        Scanner s= new Scanner(System.in);
        float income= s.nextFloat();
        float tax=0;

        if(income<=2.5){
            tax= tax+0;
        }
        else if(income>2.5 && income<5){
            tax= tax +  0.05f * (income-2.5f);
        }
        else if(income>=5 && income<10){
            tax= tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income-5.0f);
        }

        System.out.println("the amount of tax paid by person is: " +tax);



    }
}
