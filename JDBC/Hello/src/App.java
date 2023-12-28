import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

  private static final String url = "jdbc:mysql://localhost:3306/college";
  private static final String username = "root";
  private static final String password = "root";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (java.lang.ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
    try {
      Connection connection = DriverManager.getConnection(
        url,
        username,
        password
      );
      Statement stmt = connection.createStatement();
      String query = "select * from student";
      ResultSet result = stmt.executeQuery(query);
      while (result.next()) {
        int roll_n = result.getInt("roll_n");
        String full_name = result.getString("full_name");
        int age = result.getInt("age");
        int marks = result.getInt("marks");
        System.out.println(roll_n +" "+ full_name+" "+ age+" "+ marks);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
