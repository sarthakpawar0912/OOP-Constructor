package BankAccountInitialization;

public class BankAccount {
    String holder;
    int balance;

    BankAccount(String h,int b){
        holder=h;
        balance=b;
    }
    void show(){
        System.out.println(
                holder+ " Balance:  "+balance
        );
    }

    public static void main(String[] args) {
        BankAccount acc=new BankAccount("Sarthak",5000);
        acc.show();
    }
}
