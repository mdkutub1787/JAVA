package newjdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import newentity.NewStudent;

public class NewJDBCMain {

    static PreparedStatement ps;
    static ResultSet rs;
    static NewJDBC njdbc = new NewJDBC();

    public static void main(String[] args) {
        getSaveData();
        NewStudent ns = new NewStudent(2, "Sanaullah  N", "Dhaka");
        getEditData(ns);
        getShowData();

    }

    public static void getSaveData() {
        String insertSql = "insert into test(name,city)" + "values(?,?)";
        try {
            ps = njdbc.getConnection().prepareStatement(insertSql);
            ps.setString(1, "Towhid");
            ps.setString(2, "Old Dhaka");

            ps.executeUpdate();
            ps.close();
            njdbc.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void getShowData() {
        String selectSql = "select * from test";
        try {
            ps = njdbc.getConnection().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");

                System.out.println("id : " + id + " Name : " + name + " City : " + city);
            }
            ps.close();
            rs.close();
            njdbc.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getEditData(NewStudent s) {

        String updateSql = "update   test set name=?,city=? where id=?";
        try {
            ps = njdbc.getConnection().prepareStatement(updateSql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getCity());
            ps.setInt(3, s.getId());

            ps.executeUpdate();
            ps.close();
            njdbc.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
