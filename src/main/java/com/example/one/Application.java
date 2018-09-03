package com.example.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.one"}) // default scan is the current package only like com.example.one.* ....
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBean("prototype",Prototype.class).x);
		System.out.println(context.getBean(Singlton.class).x);
		System.out.println(context.getBean("proto6" ,Prototype.class).x);
		System.out.println(context.getBean(ComposedBean.class).singlton.x);

	}
}
