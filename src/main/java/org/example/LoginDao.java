package org.example;

import java.sql.*;

public class LoginDao {


    //private static Connection connection = null;
    //private LoginDao() {}

    public static boolean validate(String fname,String pass){
            boolean status = false;
            try {
                // load driver
                Class.forName("jdbc:mysql.jdbc.Driver");

                // create connection object
                String url = "jdbc:mysql://localhost:3306/demo1";
                String username = "wali";
                String password = "Loyjirga1";
                Connection connection = DriverManager.getConnection(url, username, password);

                //Connection con=DriverManager.getConnection(
                //       "jdbc:mysql://localhost:3306/demo1","wali","Loyjirga1");

                PreparedStatement ps = connection.prepareStatement(
                        "select * from Employee where fname=? and password=?");
                ps.setString(3, fname);
                ps.setString(5, pass);

                ResultSet rs = ps.executeQuery();
                status = rs.next();

            } catch (Exception e) {
                System.out.println(e);
            }
            return status;

    }
}