package JDBCConnectionTest;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnectionMain {

    static PreparedStatement ps;
    static ResultSet rs;
    static JDBCConnection db = new JDBCConnection();

    public static void main(String[] args) {

        saveData();
        Student student = new Student(4, "Yeamin khan", "Yeamin@gmail.com", "kuaushtia", "0195655630017877");
        editData(student);
        showData();
//        Student student = new Student();
//        List<Student> studentList = getById(1);
//
//        student.setName("Kutub uddin");
//        student.setEmail("kutub1787@gmail.com");
//        student.setAddress("Kushtia");
//        student.setCell("01700001787");
//        student.setId(studentList.get(0).getId());
//
//        editData(student);
//        showData();

    }

    public static void saveData() {
        String insertSql = "insert into test2(name, email, address, cell) "
                + "values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Raju");
            ps.setString(2, "Raju@gmail.com");
            ps.setString(3, "Azimpur, Dhaka");
            ps.setString(4, "017633151");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void editData(Student s) {

        String sql = "update test2 set name=?, email=?, address=?, cell=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getCell());
            ps.setInt(5, s.getId());

            ps.executeUpdate();

            ps.close();
            db.getCon().close();
            System.out.println("Edit Successfull");

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public static List<Student> getById(int id) {
//        List<Student> studentList = new ArrayList<>();
//        String sql = "select * from test2 where id=?";
//        try {
//            ps = db.getCon().prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Student s = new Student(
//                        rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getString("email"),
//                        rs.getString("address"),
//                        rs.getString("cell")
//                );
//
//                studentList.add(s);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCConnectionMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return studentList;
//
//    }
}
