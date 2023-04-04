package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1","root","Root@123");
        System.out.println(con);
        return con;
    }
}
