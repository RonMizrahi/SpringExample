package com.example.one;

import org.springframework.stereotype.Component;

@Component
public class Singlton {

	public int x=2;
	
	public int getX()
	{
		return x;
	}
}
