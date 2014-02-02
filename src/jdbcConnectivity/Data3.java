package jdbcConnectivity;

import java.sql.PreparedStatement;

public class Data3 {

	/** INSERTION-1
	 * @param args
	 */
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		int count=0;
 PreparedStatement st=Data2.connect().prepareStatement("insert into emp2 values(?,?)");
 try{
	 for(int i=11;i<22;i++){
	 st.setInt(1,i);
	 st.setString(2,("char)i+(char)i+1"));
	 if(st.executeUpdate()==1){
		 count++;
	 }
	 }
   }catch(Exception e){}
System.out.println(count+" Rows added");
	}

}
