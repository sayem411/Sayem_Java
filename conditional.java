import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int cash=sc.nextInt();
if(cash<10){
    System.out.println("cannot buy anything");
    System.out.println("Get more cash");
}
else if(cash>10 && cash<50){
    System.out.println("Can get anything");
}
else{
    System.out.println("can get both");
}

    }
}
