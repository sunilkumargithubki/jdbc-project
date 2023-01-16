package jdbcworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		return connection;
		
	}
	public void savePerson(Person person) throws Exception {
		PreparedStatement preparedstatemt=getConnection().prepareStatement("insert into person values(?,?,?)");
		preparedstatemt.setInt(1,person.getId());
		preparedstatemt.setString(2,person.getName());
		preparedstatemt.setLong(3,person.getPhone());
		preparedstatemt.execute();
		getConnection().close();
		
	}
	public void updatePerson(Person person) throws Exception {
		PreparedStatement preparedstatement=getConnection().prepareStatement("update person set name=? where id=?");
		preparedstatement.setInt(2,person.getId() );
		preparedstatement.setString(1,person.getName() );
		int count=preparedstatement.executeUpdate();
		if(count==1)
			System.out.println("updated");
		else
			System.out.println("id not found");
		getConnection().close();
		
		
	}
	public void removePerson(Person person) throws Exception {
		PreparedStatement preparedstatement=getConnection().prepareStatement("delete from person  where id=?");
		preparedstatement.setInt(1,person.getId() );
		
		int count=preparedstatement.executeUpdate();
		if(count==1)
			System.out.println("deleted");
		else
			System.out.println("id not found");
		getConnection().close();
		
		
	}
	public void displayPerson() throws  Exception {
		PreparedStatement preparedstatement=getConnection().prepareStatement("select * from person" );
		
		ResultSet resultset=preparedstatement.executeQuery();
		while(resultset.next()) {
			System.out.println(resultset.getInt("id"));
			System.out.println(resultset.getString("name"));
			System.out.println(resultset.getLong("phone"));
		}
		getConnection().close();
		
	}
	

}
