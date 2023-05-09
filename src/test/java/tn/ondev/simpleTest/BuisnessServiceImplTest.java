package tn.ondev.simpleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tn.ondev.simpleTest.service.BuisnessServiceImpl;

class BuisnessServiceImplTest {

	@Test
	void calculateSumBasic() {
		BuisnessServiceImpl buisness= new BuisnessServiceImpl();
		int calculatedValue = buisness.calculateSum(new int[] {1,2,3});
		int expectedValue=6;
		assertEquals(expectedValue, calculatedValue);
	}
	@Test
	void calculateSumEmpty() {
		BuisnessServiceImpl buisness= new BuisnessServiceImpl();
		int calculatedValue = buisness.calculateSum(new int[] {});
		int expectedValue=0;
		assertEquals(expectedValue, calculatedValue);
	}
	@Test
	void calculateSumOneValue() {
		BuisnessServiceImpl buisness= new BuisnessServiceImpl();
		int calculatedValue = buisness.calculateSum(new int[] {10});
		int expectedValue=10;
		assertEquals(expectedValue, calculatedValue);
	}

}
