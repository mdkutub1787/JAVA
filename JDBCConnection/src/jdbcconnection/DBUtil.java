package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {

    private String url = "jdbc:mysql://localhost:3306/dbcrud";
    private String user = "root";
    private String password = "";

    private String driver = "com.mysql.cj.jdbc.Driver";

    private Connection con = null;

    public Connection getCon() {
        try {
            Class.forName(driver);
            DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

}
