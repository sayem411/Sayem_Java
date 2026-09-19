public class logical {
    public static void main(String[] args) {
        /*
        Logical Operator
        &&
        */

    int a =60;
    int b =40;
    if(a<50 && b<50)
        System.out.println("Both less then 50");
    else
        System.out.println("Both not less then 50");

    if(a<50 || b<50)
        System.out.println("atleast one less then 50");


    boolean isAdult = false;
    if(!isAdult)
        System.out.println("Is adult");
    else
        System.out.println("Not Adult");
    }
}
