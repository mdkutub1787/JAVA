package JDBCConnectionTest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnectionMain {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) throws SQLException {

        JDBCConnection db = new JDBCConnection();

        String insertSql = "insrt into dbtest(name,city)" + "values(?,?)";

        ps.setString(1, "Sanaullah");
        ps.setString(2, "Rajshahi");

        ps.executeUpdate();
        ps.close();
        db.getConnection().close();

        try {
            ps = db.getConnection().prepareStatement(insertSql);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        String selectSql = "select * from dbtest";
        ps = db.getConnection().prepareStatement(selectSql);
        rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String city = rs.getString("city");

            System.out.println("Id : " + id + "Name : " + name + "city :" + city);
        }
        ps.close();
        rs.close();
        db.getConnection().close();

    }

}
