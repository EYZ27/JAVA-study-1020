package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Example1 {
 
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      String jdbc_driver = "org.postgresql.Driver";
      String jdbc_url = "jdbc:postgresql://106.243.92.221:54321/asiae";
      try {
          
         Class.forName(jdbc_driver).newInstance();
         Connection con = DriverManager.getConnection(jdbc_url, "root", "root");
         Statement st = con.createStatement();
         
         String sql = "SELECT * FROM member";
         ResultSet rs = st.executeQuery(sql);
 
         while(rs.next()){       
             String name = rs.getString(1);
             String owner = rs.getString(2);
             String date = rs.getString(3);
 
             System.out.println(name + " " + owner + " " + date);
         }
 
      
         rs.close();
         st.close();
         con.close();    
         
      } catch (Exception e) {
         e.printStackTrace();
      } 
   }
}
