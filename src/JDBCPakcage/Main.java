package JDBCPakcage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Driver Load
        try {
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "password";

            // Connection Establish
            Connection c = DriverManager.getConnection(url, username, password);
            // Statement Create
            Statement stm = c.createStatement();
            String query = "create database newDb;";

            // Execute Query
            boolean bl = stm.execute(query);
            System.out.println("Database created successfully " + bl);
            // Connection Close
            c.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}