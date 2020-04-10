package rizqifauzan.calculator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	public Calculator cal;

	@Test
	public void test_pertambahan() {
		int hasil = cal.tambah(0, 6);
		Assert.assertEquals(6, hasil);
	}
	
	@Test
	public void test_pertambahan2() {
		int hasil = cal.tambah(1, 3);
		Assert.assertEquals(4, hasil);
	}
	
	@Before
	public void persiapan() {
		cal = new Calculator();
		System.out.println("@Before Jalan");
		
	}
}
