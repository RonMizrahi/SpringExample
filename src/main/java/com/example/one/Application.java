package com.example.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@ComponentScan({"com.example.one","com.example.two"}) // default scan is the current package only like com.example.one.* ....
@ComponentScan("com.example")
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBean("prototype",Prototype.class).getX());
		System.out.println(context.getBean(Singlton.class).getX());
		System.out.println(context.getBean("proto6" ,Prototype.class).getX());
		System.out.println(context.getBean(ComposedBean.class).singlton.getX());

	}
}
