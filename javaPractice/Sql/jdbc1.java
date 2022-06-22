import java.sql.*;

class JDBCTest{
	public static void main(String args[]){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Setup");
		}catch(Exception e){
			System.out.println(e);  
		}
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false","root","gehu");
			System.out.println("connection established");
			
		}catch(Exception e){
			System.out.println("Connection not established");
		}
		try{
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(20,'Harshit');");
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}