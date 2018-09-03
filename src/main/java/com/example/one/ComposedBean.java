package com.example.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComposedBean {

	@Autowired
	public Singlton singlton;
	
	@Autowired
	public Prototype prototype;
	
}
