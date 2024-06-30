package jdbccon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCCon {

    public static DBUtilNew db = new DBUtilNew();

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        DataSave("Kutub", "Dhaka");
        System.out.println("\nAfter Insert");
        DataShow();

        DataDelete(1);
        System.out.println("\nAfter Delete");
        DataShow();

        DataUpdate("Sanaullah", "Rajshahi", 3);
        System.out.println("\nAfter Update");
        DataShow();
    }

    public static void DataSave(String name, String address) {
        sql = "insert into employee3 (name,address) values(?,?)";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.executeUpdate();

            ps.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCCon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void DataShow() {
        sql = "select * from employee3";
        try {
            ps = db.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String id = rs.getString("id");

                System.out.println("ID :" + id + "\tName :" + name + "\tAddress :" + address);
            }
            rs.close();
            ps.close();
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DataDelete(int id) {
        sql = "delete from employee3 where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void DataUpdate(String name, String address, int id) {
        sql = "update employee3 set name=?,address=? where id=?";
        try {
            ps=db.getConnection().prepareStatement(sql);
             ps.setString(1, name);
            ps.setString(2, address);
            ps.setInt(3, id);
            ps.executeUpdate();

            ps.close();
            db.getConnection().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
