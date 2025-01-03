import java.util.Scanner;
public class project_4cwh {
    public static void main(String[] args) {
        //ques 1
//        int a=10;
//        if(a=11){
//            System.out.println("i am 11");
//        }
//        else{
//            System.out.println("i am not 11");
//        }
//
//    }
        //ques 2-> input from user
        //mistake=code is too long

        float total = 300;
        Scanner s = new Scanner(System.in);
        System.out.println("enter marks in P");
        float a = s.nextFloat();
        System.out.println("enter marks in C");
        float b = s.nextInt();
        System.out.println("enter marks in M");
        float c = s.nextInt();

        System.out.println("total marks obtained: ");
        float sum = a + b + c;
        System.out.println(sum);
        System.out.println("total percentage: ");
        float percentage = (sum / total) * 100;
        System.out.println(percentage);

        if (percentage>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("congratulation!! you are passed");
        }
        else{
            System.out.println("oops! you are failed");
        }
    }

}



