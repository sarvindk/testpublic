package S.k;
import java.sql.*;
public class FirstJDBC {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/companya";
			String username="root";
			String password="admin";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			String q="insert into table2(Name,tcity,college) value (?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1, "Rahul");
			pstmt.setString(2, "Patna");
			pstmt.setString(3, "Galgotias");
			
			
			pstmt.executeUpdate();
			
			System.out.println("insert");
			con.close();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		}
	}


