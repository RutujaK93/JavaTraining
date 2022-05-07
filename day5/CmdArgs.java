import java.util.*;
class CmdArgs{
public static void main(String args[]){
int a,b,c;
if(args.length==2)
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a+b;
System.out.println("Addition is "+c);
System.out.println();
}
else
{
System.out.println("please enter 2 args");
}
}
}
