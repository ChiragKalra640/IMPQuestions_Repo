class Pen{
    String color;
    String type; // ballpoint , get

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);

    }
    public void printType(){
        System.out.println(this.type);
    }
}

//new class bna rhe hai
class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        // pen1.printType();
        // pen2.printType();

        // pen1.write();
        // pen2.write();

        // idhar hum Student class ki baat kr rhe hai

        Student s1 = new Student();
        s1.name = "chirag";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Akanksha";
        s2.age = 21;

        Student  s3= new Student();
        s3.name = "harsh";
        s3.age = 20;

        s1.PrintInfo();
        s2.PrintInfo();
        s3.PrintInfo();


    }

    
}
