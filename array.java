import java.util.Arrays;
public class array {
    public static void main(String[] args) {
       /* 
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;
        */

         boolean[] mark=new boolean [3];
        // mark[0]=97;
        // mark[1]=98;
        // mark[2]=95;
        System.out.println(mark[2]);

        int[] marks=new int [3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks[2]);
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
