package testNG_package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test (dataProvider ="getdata")
	public void testme(String username1, String password1 ){
		System.out.println(" username is: " + username1 + " password is: "+ password1);
		method1();
	}

	
	@DataProvider (name = "getdata")
		public Object[][] GetData(){
		Object[][] r = new Object[2][2];
			r[0][0]="nish";
			r[0][1]="143";
			r[1][0]="xyz";
			r[1][1]="123";
		return r;
	}
		public void method1(){
			System.out.println("method");
		}
	
}
