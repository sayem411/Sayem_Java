public class main {

    public static void main(String[] args) {
        System.out.println("Hello java");
        //sout

        /* Variable
        String name ="Sayem"
        int age =21;
        String neighbour ="Onik"
        String friend=neighbour;
        */


        /*
        Types:
        byte -[-128 to 127]
        short - 2
        int - 4(3,5,4)
        long - 8
        float -4(3.14)
        double - 8
        char-2 a,b,c,d
        boolean - 1 true/false
        */


        byte age =12;
        int phone =1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter ='@';
        boolean isAdult = false; 


        //Non- primitive types
        String name ="Sayem";
        String friend =new String("Sayem");
    
        System.out.println(name.length());

        //string concatenate
        String name1="Almas ";
         String name2="Sayem";
         String name3= name1+"And " +name2;
         System.out.println(name3);

         //Strings charAt
         String namee ="Sayem";
         System.out.println(namee.charAt(0));

         //string replace
         String namee1=name.replace('m','b');
         System.out.println(namee1);
         System.out.println(namee);

         //Substring
         String name4 ="Aman And Akku";
         System.out.println(name4.substring(0,4));
         
          
    }
}
