import java.sql.*;
public class journey {
static String city;
static String jdt;
public static Connection con;
public static Statement st;
public static ResultSet rs;
public static String query;
public static void makecon()
{
  try
  {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/bus","root","root");
    st=con.createStatement();
  }
  catch(Exception e){System.out.print(e.getMessage());}
}
}
