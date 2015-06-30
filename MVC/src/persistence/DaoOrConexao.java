package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoOrConexao {
	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	//abre o banco
	public void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://10.237.4.125:3306/maxwell","teste","teste");
	}
	public void close() throws SQLException{
		con.close();
	}
	public static void main(String[] args) throws Exception {
		DaoOrConexao conect = new DaoOrConexao();
		conect.open();
		
	}
}
