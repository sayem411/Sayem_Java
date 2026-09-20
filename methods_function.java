public class methods_function {
    public static void printjava(){
        System.out.println("Hello Java");
    }

    public static void printname(String name){
System.out.println(name);
    }
    public static void printsum(int a,int b){
        int sum =a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        printname("Sayem");
         printname("Anika");
         printjava();
         printsum(1,6);
    }
}
