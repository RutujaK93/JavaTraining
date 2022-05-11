package vs.javademo;
import java.sql.*;

public class StudImpl implements StudInterface {
    @Override
    public void save(Student st) {
        // TODO Auto-generated method stub
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "insert into Student01 set name='" + name + "' where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test3", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update Student01 set name='" + name + "' where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test3", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(Student st) {
        // TODO Auto-generated method stub
        String sql="";
        String name=st.getName();
        int id=st.getId();
        sql="delete from Student01 where id=200";
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test3", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    @Override
    public Student getStud(int id) {
        // TODO Auto-generated method stub
        return null;
    }




}
