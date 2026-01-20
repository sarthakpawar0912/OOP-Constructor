package InitializingVariables;

import javax.xml.stream.events.StartDocument;

public class Student {
    int roll;
    String name;
    Student(){
        roll=1;
        name="Sarthak";
    }
    void display(){
        System.out.println(roll+" "+name);
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.display();
    }
}
