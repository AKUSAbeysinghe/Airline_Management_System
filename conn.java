package ams;



import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    
    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinemanagementsystem", "root", "Abc@1234");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


