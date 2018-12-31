package finalprojectvirtualclassroom;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
     Connection con = null;
     ResultSet rs=null;

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_classroom", "root", "");  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

     public static Connection java_db (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_classroom", "root", "");  
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public ResultSet showFromDB(String query){ 
    
      
       try{
           //String ="Select * from Student";
           Statement st = con.createStatement();
           rs = st.executeQuery(query);
           
           return rs;
          
       }
       catch(SQLException e){
       
       }
       
       return null;
   }
}

    




