package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.one.Prototype;

@Configuration
public class CustomConfiguration {

	@Bean
	public Prototype proto6()
	{
		Prototype p=new Prototype();
		p.x=6;
		return p;
	}
	
}
