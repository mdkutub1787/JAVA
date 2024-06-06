package jdbcconnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author MD KUTUB UDDIN
 */
public class JDBCMain {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        JDBC jdbc = new JDBC();

        String insertSql = "insert into test(name,city)" + "values(?,?)";
        try {
            ps = jdbc.getConnection().prepareStatement(insertSql);
            ps.setString(1, "Kutub Uddin");
            ps.setString(2, "Kushtia");
            ps.executeUpdate();
            ps.close();
            jdbc.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        String selectSql = "select * from test";
        try {
            ps = jdbc.getConnection().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");

                System.out.println("Id  : " +id + " Name: " +name + " City : " +city);
            }
            ps.close();
            rs.close();
            jdbc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
