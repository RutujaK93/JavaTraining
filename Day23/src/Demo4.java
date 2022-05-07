interface B{
    void add(int x,int y);
}
class Test implements B{
    @Override
    public void add(int x, int y){
        System.out.println(x+y);
    }
}
public class Demo4 {
    public static void main(String[]args){
        Test t1=new Test();
        t1.add(10,20);
        B ob1=new B(){
            @Override
            public void add(int x,int y){
                System.out.println(x+y);
            }
        };
        ob1.add(100,200);

    }

}
