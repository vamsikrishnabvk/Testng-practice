package testngpractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Suitetest {
	@BeforeClass
	void beforeclass()
	{
		System.out.println("this will execute before class-Suiteclass");
	}
	@Test
	void testcase3()
	{
		System.out.println("this is test case3");
	}
    @Test
    void testcase4()
    {
    	System.out.println("this is testcase4");
    }
}
