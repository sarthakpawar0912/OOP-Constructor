package ConstructorOverloading;

public class Product {
    Product(){
        System.out.println("Default Product");
    }
    Product(String name){
        System.out.println("Product: "+name);
    }

    public static void main(String[] args) {
        new Product();
        new Product("Mobile");
    }
}
