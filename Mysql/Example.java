package javaTraingSql;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class Example
	{
		public static void main(String[] args)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/snehadb","root","root");
				Statement s= c.createStatement();
				//ResultSet r= s.executeQuery("select count(sname) from student");
				ResultSet rs= s.executeQuery("select max(mark) from student");
				/*while(r.next())
				{
					System.out.println(r.getString(1));
					
				}*/
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	




	}


