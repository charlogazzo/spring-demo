package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Value("${foo.name}")
	private String athleteName;
	@Value("${foo.promoter}")
	private String promoter;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// constructor injection
	/*
	@Autowired
	public FootballCoach(FortuneService theFortuneService) {
		System.out.println("inside constructor");
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return (athleteName + ", Practice long-range control, promoted by: " + promoter);
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
