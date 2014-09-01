
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBConnection {
    
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    static PreparedStatement pst;
    static String table;
    
    public DBConnection(){
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           conn = DriverManager.getConnection("jdbc:mysql://192.168.1.20:3306/costs?","jonas","pishare");
           st = conn.createStatement();           
       } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
           JOptionPane.showMessageDialog(null,e);           
       }       
    }
}
