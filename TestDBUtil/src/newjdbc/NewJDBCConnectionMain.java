package newjdbc;

import JDBCConnectionTest.JDBCConnection;
import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewJDBCConnectionMain {

    static PreparedStatement ps;
    static ResultSet rs = null;
    static JDBCConnection db = new JDBCConnection();

    public static void main(String[] args) {
        saveData();
        Student student = new Student(3, "name", "email", "address", "01234");
        editData(student);
        showData();
    }

    public static void saveData() {
        String insertSql = "insert into test2(name,email,address,cell)" + "values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Kutub Uddin");
            ps.setString(2, "Kutub1234@gmail.com");
            ps.setString(3, "Bokshibazar, Dhaka");
            ps.setString(4, "017633151");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        String selectSql = "select * from test2";
        try {
            ps = db.getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");

            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(Student s) {
        String updateSql = "update test2 set name=?,email=?,address=?,cell=? where id=?";

        try {
            ps = db.getCon().prepareStatement(updateSql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getCell());
            ps.setInt(5, s.getId());

            ps.executeUpdate();

            ps.close();
            db.getCon().close();
            System.out.println("Data Update succecfully");

        } catch (SQLException ex) {
            Logger.getLogger(NewJDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
