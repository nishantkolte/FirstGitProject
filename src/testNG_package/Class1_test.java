package testNG_package;


import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//This is my second commit
//This is edited in GIT repository. 
//This is my second commit
public class Class1_test {
@BeforeTest (groups="Smoke")
public void before_func(){
	System.out.println("beforetest executed");
}
	
@Test (priority=1, groups="Smoke")
public void test1(){
	System.out.println("class 1 test1 executed");
}

@BeforeClass (groups="Smoke")
public void bfcls(){
	System.out.println("before class executed");
}
@AfterClass
public void aftrcls(){
	System.out.println("after class executed");
}
@BeforeMethod
public void method1(){
	System.out.println("Before method executed");
}
@AfterMethod
public void after1(){
	System.out.println("After method executed");
}


@Test (priority=2)
public void test2(){
	System.out.println("class1 test2 executed");
}
@Test (priority=3)
public void test3(){
	System.out.println("class1 test3 executed");
}
@AfterTest
public void after_func(){
	System.out.println("arftertest executed");
}
}
