package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    protected static Connection con;
    
    protected static void getInstance() {
        if (con == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/qlstk_test";
            String dbClass = "com.mysql.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
