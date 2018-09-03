package com.example.one;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {

	public int x=1;

	public int getX()
	{
		return x;
	}
}
