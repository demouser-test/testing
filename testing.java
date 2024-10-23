import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableApp {
    public static void main(String[] args) {
        String userInput = "someUserInput"; // Simulate user input
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
