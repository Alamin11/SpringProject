package com.dayDreamer.gameRunner.sample.enterprise.flow.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dayDreamer.gameRunner.sample.enterprise.flow.business.BusinessServices;


//Sending response to user in the right format

@RestController
public class Controller {
	@Autowired
	private BusinessServices businessServices;
	
//getting the link
	@GetMapping("/sum")
	public long displaySum() {
		return businessServices.calculate();
	}
}



