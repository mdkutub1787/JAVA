package dbcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

public class DBCrud {

    public static DBUtil db = new DBUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        saveData("sala Uddin", "sami@gmail.com", "Lalbagh", "123456789");
        System.out.println("\n After insert");
        showData();
        
        deleteData(10);
        System.out.println("\n After Delete ");
        showData();
        
        updateData("Kutub Uddin","kutub@gmail.com","Lalbagh","0000000", 9);
        System.out.println("\n After Update");
        showData();
    }

    public static void saveData(String name, String email, String address, String cellno) {
        sql = "insert into employee(name, email, address, cellno)"
                + " values(?,?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {
        sql = "select * from employee";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cellno = rs.getString("cellno");
                String id = rs.getString("id");

                System.out.println("ID: " + id + " \tName: " + name + "\t Email: " + email + " \tAddress: " + address + " \tCell No: " + cellno);

            }

            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        sql = "delete from employee where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateData(String name, String email, String address, String cellno, int id) {
        sql = "update employee set name=?, email=?, address=?, cellno=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);
            ps.setInt(5, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
