package JDBCConnectionTest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnectionMain {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        JDBCConnection db = new JDBCConnection();
        String insertSql = "insert into student(name, email, address, cell) "
                + "values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Raju");
            ps.setString(2, "Raju121@gmail.com");
            ps.setString(3, "Azimpur, Dhaka");
            ps.setString(4, "0157522151");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        String selectSql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");

                System.out.println("Id is " + id + " name: " + name + " Email: " + email
                        + " Address: " + address + " Cell No :" + cell);
            }
            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
