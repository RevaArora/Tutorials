package jdbcConnectivity;

import java.sql.*;

public class Data1 {

	/**Basically all we do in a data DataBase is CRUD, ie
	 * C-Create
	 * R-Read
	 * U-Update
	 * D-Delete
	 * In this one we use prepared statement to retrieve data.
	 * @param args
	 * remove comments o use fo
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/data","root","");
    	  Statement st=con.createStatement();
	//	Statement st=Data2.connect().createStatement(); //-for using global method that returns connection object, this is helpful in managing the project
		ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
      
	}

}
