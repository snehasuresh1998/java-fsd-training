package javaTraingSql;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	
	public class MySqlEx {
		public static void main(String[] args)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/snehadb","root","root");
				Statement s= c.createStatement();
				//ResultSet r= s.executeQuery("select * from emp");
				ResultSet r= s.executeQuery("select * from student");
				while(r.next())
				{
					System.out.println(r.getInt(1)+r.getString(2));
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}



