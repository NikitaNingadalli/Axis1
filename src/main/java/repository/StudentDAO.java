package repository;

import entities.Student;
import service.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
    ResultSet r;
    Student st;
    ArrayList<Student> slist = new ArrayList<Student>();

   /* public ArrayList<Student> getAll() {
        try {
            Statement stm = DBConnection.getConnection().createStatement();
            r = stm.executeQuery("select * from students");
            while (r.next()) {
                int rno = r.getInt(1);
                String sname = r.getString(1);
                String email = r.getString(2);

                st = new Student();
                st.setRno(rno);
                st.setSname(sname);
                st.setEmail(email);


                slist.add(st);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;
    }*/

    public ArrayList<Student> getByRollNo() {
        try {
            Statement stm = DBConnection.getConnection().createStatement();
            r = stm.executeQuery("select sname,email from students where rno=101;");
            while (r.next()) {
                //int rno = r.getInt();
                String sname = r.getString(1);
                String email = r.getString(2);

                st = new Student();
                //st.setRno(rno);
                st.setSname(sname);
                st.setEmail(email);


                slist.add(st);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;
    }
}
