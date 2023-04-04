package entities;

public class Student {
    int rno;
    String sname;
    String email;


    public Student() {
    }

    public Student(int rno, String sname, String email) {
        this.rno = rno;
        this.sname = sname;
        this.email = email;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
