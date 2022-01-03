package testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotions {
	@BeforeClass
	void beforeclass()
	{
		System.out.println("this will execute before class-Annotions");
	}
@BeforeMethod
void beforeMethod()
{
	System.out.println("this will execute before every method");
}
@AfterMethod
void afterMethod()
{
	System.out.println("this will execute after every method");
}
@Test
void testcase1()
{
	System.out.println("this is test1");
}
@Test
void testcase2()
{
	System.out.println("this is test2");
}
}
