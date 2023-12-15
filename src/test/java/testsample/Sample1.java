package testsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test
	public void test1()
	{
		System.out.println("hello");
		Assert.assertTrue(10==20);
	}
	
	
	

}
