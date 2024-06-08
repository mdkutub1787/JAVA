package newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewJDBC {

    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/jdbctest";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;

    }

}
