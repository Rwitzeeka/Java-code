import java.util.Scanner;
public class lecture_17n18 {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if(age>=50){
            System.out.println("get retired");
        }
        else if(age>40){
            System.out.println("raise kids");
        }
        else if(age>30){
            System.out.println("have kids");
        }
        else if(age>20){
            System.out.println("get married");
        }
        else if(age>=18){
            System.out.println("go to college");
        }
        else if(age>5){
            System.out.println("go to school");
        }
        else{
            System.out.println("sleep kid");
        }

    }
}
