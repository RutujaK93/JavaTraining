//Create a class that captures airline tickets. 
//Each ticket lists the departure and arrival cities, a flight number, and a seat assignment. 
//A seat assignment has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.
 class ticket{
      String dep;
       String arrival;
       int flightno;
       String seat;
       
      void setInfo(String x, String y,int z ,String a){                                                                           
         dep=x;
        arrival=y;
        flightno=z;
       seat=a;
    }
     void getInfo(){
      System.out.println(dep);
      System.out.println(arrival);
      System.out.println(flightno);
      System.out.println(seat);
      }
 
      
}
public class Assig4{
public static void main(String arg[])
{
    ticket p1=new  ticket();
    ticket p2=new  ticket();
    p1.setInfo("aurangabad","pune", 1234, "12f");
    p1.getInfo();
    p2.setInfo("aurangabad","bangalore",12345,"13f");
    p2.getInfo();

}
}