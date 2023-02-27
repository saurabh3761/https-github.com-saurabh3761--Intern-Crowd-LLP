package cv.generator;
import java.sql.*;
import javax.swing.*;
public class db {  
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:D:\\cvdatabase.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            System.out.println("connection done successfully");
            return conn;
            //System.out.println(conn);   
            
        }catch (Exception e){
            System.out.println("connection failed"+e);
            //JOptionPane.showMessageDialog(null, e);
            return null;
        }    
    }
    public static void main(String args[]){
    java_db();
    
    }
}
