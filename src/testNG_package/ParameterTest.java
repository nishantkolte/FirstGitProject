package testNG_package;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test (priority=2, groups="paramtest" )
	@Parameters ({"username","password"})
	public void testme(String username1, String password1){
		System.out.println(" username is: " + username1 + " password is: "+ password1);
	}

}
