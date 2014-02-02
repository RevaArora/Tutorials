package jdbcConnectivity;

import java.sql.*;
class Data2
{
   static Connection connect() throws Exception
   {
       Class.forName("com.mysql.jdbc.Driver");
       return DriverManager.getConnection("jdbc:mysql://localhost:3308/data","root","");
   }
}