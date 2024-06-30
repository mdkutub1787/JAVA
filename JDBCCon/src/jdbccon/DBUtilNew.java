package jdbccon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtilNew {

    private String url = "jdbc:mysql://localhost:3307/dbcrud";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con = null;

    public Connection getConnection() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtilNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtilNew.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

}
