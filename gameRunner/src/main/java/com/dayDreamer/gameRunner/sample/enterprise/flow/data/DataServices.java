//Getting Data from DataLayer
package com.dayDreamer.gameRunner.sample.enterprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataServices {
	public List<Integer> retriveData() {
		return Arrays.asList(12,23,45,56,78,89,90);
	}
	
}