
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write Something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
    this.name=name;
    this.age=age;
    }
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name + " " + age);
    }
}
public class oops {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Gel";

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.write();
        
        pen1.printcolor();
        pen2.printcolor();

        Student s1=new Student("Sayem",21);
        s1.printinfo();
        s1.printinfo(s1.name,s1.age);
    }
}
