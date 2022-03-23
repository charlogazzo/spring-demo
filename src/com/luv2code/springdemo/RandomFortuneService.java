package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"All the way up", "Living da vida loca", "I go always pray for you", "Consistency is key"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
