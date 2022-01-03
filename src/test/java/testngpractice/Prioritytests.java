package testngpractice;

import org.testng.annotations.Test;

public class Prioritytests {
	@Test(priority = 1)
	void testone()
	{
		System.out.println("this is test1");
	}
	@Test(priority = 3,enabled = false)
	void testtwo()
	{
		System.out.println("this is test2");
	}

	@Test(priority = 2)
	void testthree()
	{
		System.out.println("this is test3");
	}
	@Test(priority = 4)
	void testfour()
	{
		System.out.println("this is test4");
	}
}
