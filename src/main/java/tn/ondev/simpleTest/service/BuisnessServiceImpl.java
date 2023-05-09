package tn.ondev.simpleTest.service;

import java.util.Arrays;

public class BuisnessServiceImpl {
	
	private DataService dataService;
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}
	public int calculateSumDataService() {
		return Arrays.stream(dataService.getData()).reduce(Integer::sum).orElse(0);
	}
}
