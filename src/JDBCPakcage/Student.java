package JDBCPakcage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
    public void createDB(){

    }
    public void createTable(){
        try {
            String url = "jdbc:mysql://localhost:3306/students";
            String username = "root";
            String password = "password";

            // Connection Establish
            Connection c = DriverManager.getConnection(url, username, password);
            // Statement Create
            Statement stm = c.createStatement();
            String query = "create table student (id int(3), name varchar(200), email varchar(200));";

            // Execute Query
            boolean bl = stm.execute(query);
            System.out.println("Table created successfully");
            // Connection Close
            c.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void createData(){
        try {
            String url = "jdbc:mysql://localhost:3306/students";
            String username = "root";
            String password = "password";

            // Connection Establish
            Connection c = DriverManager.getConnection(url, username, password);
            // Statement Create
            Statement stm = c.createStatement();
            String query = "INSERT INTO student VALUES (1, 'Darshan Trivedi', 'dbtrivedi10@gmail.com')";

            // Execute Query
            boolean bl = stm.execute(query);
            System.out.println("Data insert into db successfully");
            // Connection Close
            c.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readAllStudentData(){
        try {
            String url = "jdbc:mysql://localhost:3306/students";
            String username = "root";
            String password = "password";

            // Connection Establish
            Connection c = DriverManager.getConnection(url, username, password);
            // Statement Create
            Statement stm = c.createStatement();
            String query = "SELECT * FROM student;";

            // Execute Query
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                System.out.println(" ID = " + rs.getInt(1));
                System.out.println(" Name = " + rs.getString(2));
                System.out.println(" Email = " + rs.getString(3));

            }
            System.out.println("Data insert into db successfully");
            // Connection Close
            c.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
