package testNG_package;
//edited in GIT and needs to be pulled.

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2_test {
@BeforeTest (groups="Smoke")
public void before_func(){
	System.out.println("beforetest executed");
}
	
@Test (priority=4, groups="Smoke")
public void test1(){
	System.out.println("class2 test1 executed");
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

@Test (priority=5)
public void test2(){
	System.out.println(" class 2 test2 executed");
}
@Test (priority=6)
public void test3(){
	System.out.println("class 2 test3 executed");
}
@AfterTest
public void after_func(){
	System.out.println("arftertest executed");
}
}
