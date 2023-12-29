
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

  private static String url = "jdbc:mysql://localhost:3306/emp";
  private static String user = "root";
  private static String passowrd = "root";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
    try {
      Connection connection = DriverManager.getConnection(url, user, passowrd);
      Statement stmt = connection.createStatement();
      ResultSet set = stmt.executeQuery("select * from company");

      while (set.next()) {
        int Emp_ID = set.getInt("Emp_ID");
        String Name = set.getString("Name");
        int age = set.getInt("age");
        int salary = set.getInt("salary");
        System.out.println(Emp_ID + " " + Name + " " + age + " " + salary);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
