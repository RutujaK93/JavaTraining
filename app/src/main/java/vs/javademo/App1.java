package vs.javademo;

public class App1 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       
        Student st=new Student();
        st.setId(100);
        st.setName("test");

        StudImpl ob;
        ob=new StudImpl();
        ob.update(st);


        Student st1=new Student();
        st.setId(200);
        st.setName("abc");

        StudImpl ob1;
        ob1=new StudImpl();
        ob1.delete(st1);

        Student st2=new Student();
        st.setId(100);
        st.setName("test");

        StudImpl ob2;
        ob2=new StudImpl();
        ob2.save(st2);
    }

}
