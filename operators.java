public class operators {
    public static void main(String[] args) {
        int a=1;
        int b =2;
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        double c=5;
        double d =3;
        double modulo=c%d;
        System.out.println(modulo);
//pre incriment,post increment,pre decrement, post decrement
        int numb =5;
        //numb++;
       // ++numb;
          System.out.println(numb++);
           System.out.println(numb);
        int num=9;
             System.out.println(++num);
           System.out.println(num);
        int n=3;
            System.out.println(n--);
           System.out.println(n);

        int number=7;
            System.out.println(--number);
           System.out.println(number);
    }
}
