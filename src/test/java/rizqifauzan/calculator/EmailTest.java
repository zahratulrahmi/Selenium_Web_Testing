package rizqifauzan.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EmailTest {

	Calculator cal;

	@Test
	public void test1() {
		int c = cal.tambah(3, 4);
		Assert.assertEquals(7, c);
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");

	}

	@Test
	public void test3() {
		System.out.println("Test3");

	}

	@Test
	public void test4() {
		System.out.println("Test4");

	}

	@Before
	public void before() {
		cal = new Calculator();
		System.out.println("Before Jalan");

	}

	@After
	public void after() {
		System.out.println("After Jalan");
	}

//	
//	@BeforeClass
//	public void beforeClass112() {
//		System.out.println("Before Class Jalan");
//
//	}
//	
//	public void afterClass112() {
//		System.out.println("After Class Jalan");
//	}

	// @before
	// @after
	// @beforeClass
	// @afterClass

}
