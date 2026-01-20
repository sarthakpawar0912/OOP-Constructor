package CollegeAdmissionSystem;

public class Admission {
    String name;
    int percentage;

    Admission(String n,int p){
        name=n;
        percentage=p;
    }

    void status(){
        if(percentage>=60){
            System.out.println(name+"Admission Granted");
        }else{
            System.out.println(
                    name+"Admission Rejected"
            );
        }
    }

    public static void main(String[] args) {
        Admission a=new Admission("Sarthak ",78);
        a.status();
    }
}
