import java.util.Scanner;
public class CBSEcalc_cwh {
    public static void main(String[] args) {
        //cbse code making, taking input from user and calculate the percentage
        //imp point:- float total
        System.out.println("Taking value from user, marks out of 100");
        Scanner s= new Scanner(System.in);
        float total= 500;
        System.out.println("Enter marks obtained in eng: ");
        float a= s.nextFloat();
        System.out.println("enter marks obtained in sst: ");
        float b= s.nextFloat();
        System.out.println("enter marks obtained in maths: ");
        float c= s.nextFloat();
        System.out.println("enter marks obtained in geo: ");
        float d= s.nextFloat();
        System.out.println("enter marks obtained in science: ");
        float e= s.nextFloat();

        float sum= a+b+c+d+e;
        System.out.println("total marks obtained are: ");
        System.out.println(sum);
        float percentage= (sum/total)*100;
        System.out.println("Here is the percentage");
        System.out.println(percentage);




    }
}
