package testngpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersee {
	@DataProvider(name="LoginDataProvider")
	public Object[][] getdata()
	{
		Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mon@gmail.com","mno"}};
		return data;
	}
@Test(dataProvider = "LoginDataProvider")
public void logintest(String email,String password)
{
	System.out.println(email+"    "  +password);
}
}
