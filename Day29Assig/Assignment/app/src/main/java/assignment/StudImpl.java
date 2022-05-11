package assignment;
import java.sql.*;
public class StudImpl implements StudInterface {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs= null;
    StudImpl() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test3","postgres","root");
        stmt = conn.createStatement();
    }
    @Override
    public void save(Student st) throws Exception{
        String name = st.getName();
        int id = st.getId();
        String sql = "insert into student01 values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }

    @Override
    public void update(Student st) throws Exception {
        String name = st.getName();
        int id = st.getId();
        String sql = "update student01 set name='" + name + "' where id=" + id;
        conn.close();
    }

    @Override
    public void select(Student st) throws Exception{
        String sql="select * from student01";
        rs=stmt.executeQuery(sql);
        System.out.println("#############################");
        while (rs.next()) {
            System.out.println(rs.getInt("Id") +"   |   "+ rs.getString("Name"));
        }
        System.out.println("##############################");
        conn.close();
    }

    @Override
    public void delete(Student st) throws Exception{
        String name = st.getName();
        int id = st.getId();
        String sql = "delete from student01 where id="+id;
        System.out.println("Record Deleted!!");
        stmt.executeUpdate(sql);
        conn.close();

    }

    @Override
    public Student stud(int id) {
        return null;
    }
}

