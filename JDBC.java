package java;
import java.sql.*;
import java.sql.SQLException;

public class JDBC {
   static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";  
   static final String DB_URL =  "jdbc:mysql://localhost/STUDENTS";
   static final String USER = "username";
   static final String PASS = "password";
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null; 
   try{
      Class.forName("com.mysql.jdbc.Driver");
 
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO Registration " +
                   "VALUES (100, 'Zara', 'Ali', 18)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (102, 'Zaid', 'Khan', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES(103, 'Sumit', 'Mittal', 28)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
     
         }catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
     }
      {catch(SQLException se){
      conn.close();
      
    }
    
   System.out.println("Goodbye!");
}


}
