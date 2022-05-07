import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "root");

        System.out.println("Connection done");

        Statement stmt;
        stmt = conn.createStatement();
        String sql;
        sql = "insert into student values(500,'testing')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}
