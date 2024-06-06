package JDBCConnectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnection {

    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/dbtset";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {
        try {
            Class.forName(driver);
             con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
       

    }

}