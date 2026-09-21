
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write Something");
    }
}
public class oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="Blue";
        pen1.type="Gel";
        pen1.write();
    }
}
