//example of JDBC 
import java.sql.*;
class Test81
{
       public static void main(String args[])
        {
           Connection co=null;
            try
			{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivekdb1","root","Vivek123@@");
                 if(con!=null)
                 {
                     System.out.println("connection made");
					 Statement stmt= con.createStatement();
					 ResultSet rs= stmt.executeQuery("select * from employee");
					 while(rs.next()){
						 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
					 }
                 }
               

                 else
                 System.out.println("Connection not made");
           
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