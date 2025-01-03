import java.util.Scanner;
public class leapYEARcalc {
    public static void main(String[] args) {
        //leap year calculation
        System.out.println("Enter the year: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year%400==0|| year%100!=0 && year%4==0){
            System.out.println("it is a leap year");

        }
        else{
            System.out.println("it is not a leap yr");
        }
        System.out.println("code finished");
    }
}




