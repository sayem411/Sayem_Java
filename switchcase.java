import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

 System.out.println("Enter your choice:(1-7):");
    Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Friday");
        }
    }
}
