package ATMSimulation;

public class ATM {
    int balance;

    ATM(int initialAMount){
        balance=initialAMount;
    }
    void showBalance(){
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        ATM atm= new ATM(10000);
        atm.showBalance();
    }
}
