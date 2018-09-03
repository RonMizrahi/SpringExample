package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.one.ComposedBean;
import com.example.one.Prototype;
import com.example.one.Singlton;

@Configuration
@ComponentScan({"com.example.one","com.example.demo"}) // default scan is the current package only like com.example.demo.* ....
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
