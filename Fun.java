import java.sql.*;
import java.util.Scanner;
class Fun
{
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Vivek123@@");
			System.out.println("Enter your ID");
			int a=sc.nextInt();
			System.out.println("Enter your Name");
			String b=sc.next();
			System.out.println("Enter your mob-no");
			int c=sc.nextInt();
			System.out.println("Enter your City");
			String d=sc.next();
			String q="insert into bankcustomer values(a,b,c,d)";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("queries is inserted in databases");
			ResultSet rs=stmt.executeQuery("select * from bankcustomer");
			while(rs.next()){
		    System.out.println("******************************************************");
			System.out.println("id:"  +rs.getString(1));
			System.out.println("Name:"  +rs.getString(2));
			System.out.println("Mobno:"  +rs.getString(3));
			System.out.println("City:"  +rs.getString(4));
		}
			con.close();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}