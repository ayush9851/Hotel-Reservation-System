import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBConnection {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/hotel_db";
            String user = "root";
            String pass = "ayush@2003"; // put your password

            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ CONNECTED TO MYSQL");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

