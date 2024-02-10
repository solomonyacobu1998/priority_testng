package testNg_full_pack;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest2 {
	@Parameters({ "solomon1" })
	@Test(priority = 1)
	public void one(String one) {
		System.out.println(one);

	}

	@Parameters({ "solomon2" })
	@Test(priority = 2)
	public void two(String two) {
		System.out.println(two);
	}

	@Parameters({ "solomon3" })
	@Test(priority = 3)
	public void three(String three) {
		System.out.println(three);
	}

	@Parameters({ "solomon4" })
	@Test(priority = 4)
	public void four(String one) {
		System.out.println(one);
	}

	@Parameters({ "solomon5" })
	@Test(priority = 5)
	public void five(String one) {
		System.out.println(one);
	}

	@Parameters({ "solomons" })
	@Test(priority = 0)
	public void six(String one) {
		System.out.println(one);
	}
}