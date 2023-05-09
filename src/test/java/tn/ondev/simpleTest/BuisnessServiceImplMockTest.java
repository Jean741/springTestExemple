package tn.ondev.simpleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.ondev.simpleTest.service.BuisnessServiceImpl;
import tn.ondev.simpleTest.service.DataService;

@ExtendWith(MockitoExtension.class)
class BuisnessServiceImplMockTest {
	@InjectMocks
	BuisnessServiceImpl buisness;
	@Mock
	DataService dataServiceMock;
	@BeforeEach
	public void before() {
		buisness.setDataService(dataServiceMock);
	}
	
	@Test
	void calculateSumBasic() {
		when(dataServiceMock.getData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, buisness.calculateSumDataService());
	}
	@Test
	void calculateSumEmpty() {
		when(dataServiceMock.getData()).thenReturn(new int[] {});
		assertEquals(0, buisness.calculateSumDataService());
	}
	@Test
	void calculateSumOneValue() {
		when(dataServiceMock.getData()).thenReturn(new int[] {10});
		assertEquals(10, buisness.calculateSumDataService());
	}

}
