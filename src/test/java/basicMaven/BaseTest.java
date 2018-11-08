package basicMaven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Run BEFORE every thing");
	}
	
	@BeforeTest
	public void testBefore( ) {
		System.out.println("Run BEFORE every other test");
	}
	
	@Test
	public void testFive() {
		System.out.println("testFive5555");
	}
	
	@Test
	public void testSix() {
		System.out.println("testSix");
	}
	
	@AfterTest
	public void testAfter( ) {
		System.out.println("Run AFTER Base test");
	}
	
	@AfterSuite
	public void testAfterSuite( ) {
		System.out.println("Run AFTER Base test Suite");
	}

}
