package jdbcworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerCRUD {
	String facebookpassword;
	String  instagrampassword;
	String twitterpassword;
	String telegrampassword;
	String watsuppassword;
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
		return connection;
		
	}
	public void saveCustomer(Customer customer) throws Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("insert into customer(id,name,email,password,phone) values(?,?,?,?,?)");
		preparedstatemt.setInt(1,customer.getId());
		preparedstatemt.setString(2,customer.getName());
		preparedstatemt.setString(3,customer.getEmail());
		preparedstatemt.setString(4,customer.getPassword());
		preparedstatemt.setLong(5,customer.getPhone());
		
		preparedstatemt.execute();
		getConnection().close();
		System.out.println("signup succesfully");
		
	}
	public boolean login(Customer customer) throws Exception {
		
		PreparedStatement preparedstatemt=getConnection().prepareStatement("select * from customer");
		
		ResultSet resultset=preparedstatemt.executeQuery();
		
		
		while(resultset.next()) {
			
			if((resultset.getString("email")).equals(customer.getEmail())) {
				
				
				if(resultset.getString("password").equals(customer.getPassword())) {
					 facebookpassword=resultset.getString("facebookpassword");
					 instagrampassword=resultset.getString("instagrampassword");
					 twitterpassword=resultset.getString("twitterpassword");
					 telegrampassword=resultset.getString("telegrampassword");
					 watsuppassword=resultset.getString("watsuppassword");
					return true;
				}
			}
		
		}
		
		return false;
		
	
		
	}
	public void SavePassword(Customer customer) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set facebookpassword=?,instagrampassword=?,twitterpassword=?,telegrampassword=?,watsuppassword=? where email=?");
		
		preparedstatemt.setString(1,customer.getFacebookpassword());
		preparedstatemt.setString(2,customer.getInstagrampassword());
		preparedstatemt.setString(3,customer.getTwitterpassword());
		preparedstatemt.setString(4, customer.getTelegrampassword());
		preparedstatemt.setString(5, customer.getWatsuppassword());
		preparedstatemt.setString(6,customer.getEmail());
		preparedstatemt.executeUpdate();
		System.out.println("enterd passwords  succesfully");
		
		
		
	}
	public void updateFacebookPassword(Customer customer,String columnname) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set facebookpassword=? where email=? ");
		
		preparedstatemt.setString(1,customer.getFacebookpassword()); 
		preparedstatemt.setString(2, customer.getEmail());
		preparedstatemt.execute();
		getConnection().close();
		System.out.println(columnname+" is  changed passwords  succesfully");
		
		
		
	}
	public void updateInstagramPassword(Customer customer,String columnname) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set instagrampassword=? where email=? ");
		
		preparedstatemt.setString(1,customer.getInstagrampassword()); 
		preparedstatemt.setString(2, customer.getEmail());
		preparedstatemt.execute();
		getConnection().close();
		System.out.println(columnname+" is  changed passwords  succesfully");
		
		
		
	}
	public void updateTwitterPassword(Customer customer,String columnname) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set twitterpassword=? where email=? ");
		
		preparedstatemt.setString(1,customer.getTwitterpassword()); 
		preparedstatemt.setString(2, customer.getEmail());
		preparedstatemt.execute();
		getConnection().close();
		System.out.println(columnname+" is  changed passwords  succesfully");
		
		
		
	}
	public void updateTelePassword(Customer customer,String columnname) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set telegrampassword=? where email=? ");
		
		preparedstatemt.setString(1,customer.getTelegrampassword()); 
		preparedstatemt.setString(2, customer.getEmail());
		preparedstatemt.execute();
		getConnection().close();
		System.out.println(columnname+" is  changed passwords  succesfully");
		
		
		
	}
	public void updateWatusapPassword(Customer customer,String columnname) throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("update  customer set watsuppassword=? where email=? ");
		
		preparedstatemt.setString(1,customer.getWatsuppassword()); 
		preparedstatemt.setString(2, customer.getEmail());
		preparedstatemt.execute();
		getConnection().close();
		System.out.println(columnname+" is  changed passwords  succesfully");
		
		
		
	}
	public void update() throws  Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("truncate table customer ");
		
		preparedstatemt.execute(); 
		
		getConnection().close();
		
		
		
		
	}
	

}
