//Create classes that capture bank customers and bank accounts. 
//A customer has a first and last name. 
//An account has a customer and a balance. 
//Make objects for two accounts held by the same customer.
class Customer{
private String Fname;
private String Lname;

void setFname(String fname){
this.Fname=fname;
}
String getFname(){
return this.Fname;
}
void setLname(String lname){
this.Lname=lname;
}
String getLname(){
return Lname;
}
}
class Account{
int balance;
Customer cust;
}

void showAccount(){
System.out.println("fname: "+cust.getFname);
System.out.println("lname: "+cust.getLname);
System.out.println("Balance: "+balance);

Account(Customer cust,int balance){
this.cust=cust;
this.balance=balance;
}
}
public class Assig3{
public static void main(String[]args){
Customer ob1=new Customer();

ob1.setFname("abc");
ob1.setLname("xyz");
Account acc1=new Account(ob1,1000);
Account acc2=new Account(ob2,2000);
}
}


 