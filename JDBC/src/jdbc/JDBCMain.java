package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCMain {

    static PreparedStatement ps;
    static ResultSet rs;
    static DBUtil db = new DBUtil();

    public static void main(String[] args) {
//        getSaveData();
        Student student = new Student(1, "Kutub Uddin", "Kushtia");
        getShowData();
    }

    public static void getSaveData() {
        String insertSql = "insert into student(name,city)" + "values(?,?)";
        try {
            ps = db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Imtiaz");
            ps.setString(2, "Barishal");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getShowData() {
        String selectSql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(selectSql);
            ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.println("Id : " + id + "Name : " + name + "City : " + city);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
