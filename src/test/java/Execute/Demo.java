/*
 * @Sasi Vinod Akula
 * 
 * 
 */

package Execute;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {

	
	@Test	
	public void Sum()
	{
		System.out.println("Sum");
		int a = 10;
		int b=20;
		Assert.assertEquals(30, b+a);
	}
	@Test
	public void Sub()
	{
		System.out.println("Sub");
		int a = 10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	
	
	
}
