package ParameterizedConstructor;

public class Student {
    int roll;
    String name;
    Student(int r,String n){
        roll=r;
        name=n;
    }

    public static void main(String[] args) {
        Student s=new Student(1,"Sarthak");
        System.out.println(s.roll+" "+s.name);
    }
}
