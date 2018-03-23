package database45;
//shaliniprabhapadhy

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	public Connection con;
	public Statement stmt;

	public Statement getStatement() throws ClassNotFoundException, SQLException {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String connection = "jdbc:mysql://localhost:3306/selenium";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			con = DriverManager.getConnection(connection, username, password);
			stmt = con.createStatement();
			return stmt;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return stmt;

	}

	public void insertData(String query) throws ClassNotFoundException, SQLException {
		Statement sta = getStatement();
		sta.executeUpdate(query);
	}

	public ResultSet getData(String query) throws ClassNotFoundException, SQLException {
		ResultSet data = getStatement().executeQuery(query);
		return data;
	}

	public void updateData(String query) throws ClassNotFoundException, SQLException {
		getStatement().executeUpdate(query);
	}

}
