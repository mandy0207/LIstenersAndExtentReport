package myLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test
	public static void Mytest1() {
		System.out.println("i am in mytest1");
		Assert.fail();
	}
	
	@Test
	public static void Mytest2() {
		System.out.println("i am in mytest2");
	}
}
