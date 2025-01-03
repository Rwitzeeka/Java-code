import java.util.Scanner;
public class ps3_rits {
    public static void main(String[] args) {
        //ques 1
//        String name= "RITIKA SHARMA";
//        String value= name.toLowerCase();
//        System.out.println(value);
//        //OR
//        System.out.println(name.toLowerCase());
//        //QUES 2
//        System.out.println(name.replaceFirst(" ","_"));
        System.out.println("enter name: ");
        Scanner s= new Scanner(System.in);
        String name= s.nextLine();
        String letter= "Dear "+name+" thanks a lot";
        System.out.println(letter);
        System.out.println("enter new name to replace with initial one: ");
        String n2= s.nextLine();
        String l2= "Dear "+n2+" thanks a lot";
        System.out.println(l2);


//        //QUES3 to detect double and triple space

    }
}
