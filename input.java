import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age=sc.nextInt();
        System.out.println(age);

    /*
        float agee=sc.nextFloat();
        System.out.println(agee);
    */
   
   System.out.println("Input your name:");
   String name=sc.next();
   //String name=sc.nextLine(); ->for full sentence
   System.out.println(name);


    }
}
