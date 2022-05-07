abstract class Account{
    abstract void calculateIntrest();
}
class Saving extends Account{
    @Override
    void calculateIntrest(){
        System.out.println("Calculate intrest of saving");
    }
}
class Loan extends Account{
    @Override
    void calculateIntrest(){
        System.out.println("Calculate intrest of loan");
    }
}
class AccountFactory{
    static Account getAccount(String type){
        Account obj=null;
        if(type.equalsIgnoreCase("Saving")){
            obj=new Saving();
        }else if (type.equalsIgnoreCase("Loan")){
            obj=new Loan();
        }
        return obj;
    }
}
public class Demo2 {
    public static void main(String[]args){
        Account ob1=AccountFactory.getAccount("Loan");
        Account ob2=AccountFactory.getAccount("Saving");
        ob1.calculateIntrest();
        ob2.calculateIntrest();

    }
}
