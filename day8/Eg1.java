class Address{
int housenum;
string areaname;
string city;



}
class Student{
int id;
string name;
Address adr; 

public void setId(int id){
this.id=id;
}
public void setAdr(Address adr){
this.adr=adr;
}
public int getId(){
return id;}
public Address getAdr(){
return adr;} }
class Eg1{
public static void main (String[]args){
Address ad=new Address();
ad.setHousenum(1);
ad.setAreaname("abc");
ad.setCity("Aurangabad");

Student st=new Student();
int x=101;
st.setId(x);
st.setAdr(ad);
st.setName("xyz");

int id;
id1=st.getId();
String n;
n=st.getName();
Address ad1;
ad1=st.getAdr();


int hn;
hn=ad1.getHousenum();
String area;
area=ad1.getAreaname();
String city=ad1.getCity();
}
}
