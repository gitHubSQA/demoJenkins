import org.testng.annotations.*;

public class DEMO_GITHUB_TEST1 {

	@BeforeSuite
	public void unitTest_Start(){
		System.out.println("---------- Let the test begins ----------");
	}
	
	@BeforeMethod
	public boolean unitTest_Setup(){
		return true;
	}
	
	
	
	@Test
	public void unitTest_Test1(){
		System.out.println("Test1");	
	}
	
	@Test
	public void unitTest_Test2(){
		System.out.println("Test2");	
	}
	
	@Test
	public void unitTest_Test3(){
		System.out.println("Test3");	
		
	}
	
	
	@AfterMethod
	public boolean unitTest_End(){
		return false;
	}
	
	@AfterSuite
	public void unitTest_(){
		System.out.println("---------- Let the test ends ----------");	
	}
	
}
