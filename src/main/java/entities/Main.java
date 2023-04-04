package entities;

public class Main {
    public static void main(String[] args)
    {
        StudentDAO stu=new StudentDAO();
        //System.out.println(stu.getAll());
        System.out.println(stu.getByRollNo());
    }
}