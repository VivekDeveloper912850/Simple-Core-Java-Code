import java.sql.*;


class Virat 
{
     public static void main(String args[])
      {
      try
               {
              
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Vivek123@@");
              
               
                   System.out.println("connection made");
                         String q="create table Marketing(ID int(20) primary key,Name varchar(56),Mobno int(20),City varchar(78))";
                         Statement stmt=con.createStatement();
                         stmt.executeUpdate(q);
                          System.out.println("table is created");
                          stmt.executeQuerie("select * from");
         
              con.close();//closing the connecting
          }
          catch(ClassNotFoundException e)
          {
             System.out.println(e);
          }
            catch(SQLException e)
          {
           System.out.println(e);
          }
      }
}