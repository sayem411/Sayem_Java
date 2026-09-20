import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int mynumber=(int)(Math.random()*100);
       int usernumber=0;
       do{
        System.out.println("Guess my number:");
        usernumber=sc.nextInt();
        if(usernumber==mynumber){
            System.out.println("Correct Number");
            break;
        }
        else if(usernumber>mynumber){
            System.out.println("Number too large");
        }
        else{
           System.out.println("Number is smaller"); 
        }
       }while(usernumber>=0);
       System.out.println("My number was:");
       System.out.println(mynumber);
    }
}
