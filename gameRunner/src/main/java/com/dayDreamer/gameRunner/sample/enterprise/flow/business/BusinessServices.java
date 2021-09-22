//Business Logic goes here
package com.dayDreamer.gameRunner.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dayDreamer.gameRunner.sample.enterprise.flow.data.DataServices;

@Component
public class BusinessServices {
	@Autowired
	private DataServices dataService;
	public long calculate() {
		List<Integer> data = dataService.retriveData();
		return data.stream().reduce(Integer::sum).get();
	}
	
}