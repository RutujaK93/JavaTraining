import java.sql.Connection;
class MySQLHelper{
    public static Connection getMysqlDBConnection(){
        return  null;
    }
}
class OracleHelper{
    public static Connection  getOracleDBConnection(){
        return null;
    }
}
class HelperFacade {
    static Connection getConnection(String type) {
        Connection con = null;
        if (type.equals("Oracle")) {
            con = OracleHelper.getOracleDBConnection();
        } else if (type.equals("mysql")) {
            con = MySQLHelper.getMysqlDBConnection();

        }
        return con;
    }

    public class Demo1 {
        public static void main(String[] args) {
            Connection con;
            con = HelperFacade.getConnection("oracle");
        }
    }
}


