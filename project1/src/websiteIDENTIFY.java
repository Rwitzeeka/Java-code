import java.util.Scanner;
public class websiteIDENTIFY {
    public static void main(String[] args) {
        //identifying websites
        System.out.println("Enter the website: ");
        Scanner s= new Scanner(System.in);
        String website= s.next();
        if(website.endsWith(".org")){
            System.out.println("It is an organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an Indian website");
        }
        else{
            System.out.println("This website ends with none of these");
        }


    }
}
