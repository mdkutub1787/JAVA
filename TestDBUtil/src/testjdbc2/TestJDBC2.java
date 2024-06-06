package testjdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJDBC2 {

    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/dbtest";
        String user = "root";
        String password = "1234";
        String Driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, password);

            // Insert statement
            PreparedStatement insertStatement = con.prepareStatement("INSERT INTO student (Name, City) VALUES (?, ?)");
            insertStatement.setString(1, "Sanaullah ");
            insertStatement.setString(2, "Rajshahi");
            int rowsInserted = insertStatement.executeUpdate();
           

            // Select statement
            PreparedStatement selectStatement = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = selectStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + " "
                        + rs.getString("Name") + " " + rs.getString("City"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestJDBC2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
