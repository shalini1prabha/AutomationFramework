package database45;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DBTest {
	//WebDriver driver;

	@Test
	public void SelectData() throws ClassNotFoundException, SQLException {
		//String textData = driver.findElement(By.xpath("")).getText();
		String query = "select * from seleniumusers";
		DataBase database = new DataBase();
		ResultSet data = database.getData(query);
		System.out.println(data);
		while (data.next()) {
			System.out.println(data.getString(1) + " " + data.getString(2));
		}
	}

	@Test
	public void insertData() throws ClassNotFoundException, SQLException {
		String query = "insert into seleniumusers values ('hhiyhy','hjjyuy@gmail.com')";
		DataBase database = new DataBase();
		database.insertData(query);
	}

	@Test
	public void updateData() throws ClassNotFoundException, SQLException {
		String query = "update seleniumusers set firstname='4567' where email='vpp1@yahoomail.com'";
		DataBase database = new DataBase();
		database.updateData(query);
		new DBTest().SelectData();
	}
}
