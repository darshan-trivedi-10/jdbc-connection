package JDBCPakcage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Driver Load
        Student s = new Student();
        s.createTable();
        s.createData();
        s.readAllStudentData();

    }

}