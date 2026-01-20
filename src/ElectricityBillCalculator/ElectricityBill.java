package ElectricityBillCalculator;

public class ElectricityBill {
    int units;
    double bill;

    ElectricityBill(int u){
        units=u;
        bill=units*5;
    }

    void showBill(){
        System.out.println("Units: "+units);
        System.out.println("Bill: ₹"+bill );
    }

    public static void main(String[] args) {
        ElectricityBill e=new ElectricityBill(150);
        e.showBill();
    }
}
