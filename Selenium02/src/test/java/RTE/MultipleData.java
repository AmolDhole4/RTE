package RTE;

import org.testng.annotations.DataProvider;

public class MultipleData {

	
	@DataProvider (name="logindata")
	public static Object [] [] Test_Multiple_data() {
		
		return new Object[][] {
			{"25PU044923"},
			{"25PU067548"}
			
		};
			
		}
}
