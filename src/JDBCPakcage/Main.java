package JDBCPakcage;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        // Driver Load
        try {
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "password";

            Connection c = DriverManager.getConnection(url, username, password);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
