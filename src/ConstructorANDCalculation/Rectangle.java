package ConstructorANDCalculation;

public class Rectangle {
    int length, breadth;

    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("Area: "+(length*breadth));
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,5);
        rectangle.area();
    }
}
