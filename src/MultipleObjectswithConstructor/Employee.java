package MultipleObjectswithConstructor;

public class Employee {
    int id;
    String name;

    Employee(int i,String n){
        id=i;
        name=n;
    }
    void show(){
        System.out.println(id+ " "+name);
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1,"Sarthak");
        Employee e2=new Employee(2,"Piyush");

        e1.show();
        e2.show();
    }
}
