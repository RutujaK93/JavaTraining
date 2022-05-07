class Test1 implements Runnable {
    Thread t;

    Test1(String n) {
        t = new Thread(this);
        t.setName(n);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread" + t.getName() + ":" + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}



public class Demo2 {
    public static void main(String[] args){
        Test1 t1=new Test1("A");
        Test1 t2=new Test1("B");
        Test1 t3= new Test1("C");
        try {
            for(int i=0;i<5;i++){
                System.out.println("Main Thread"+i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){

        }
    }
}
