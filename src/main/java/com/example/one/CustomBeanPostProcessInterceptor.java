package com.example.one;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Interceptor which for each created bean wait until the random returns even
 * value
 * PostProcessor Flow:
 * 1)BeforeInit
 * 2)Init function of the bean
 * 3)AfterInit
 * @author cp
 *
 */
@Component
public class CustomBeanPostProcessInterceptor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		if (bean instanceof com.example.one.Prototype) {
			Prototype temp = ((com.example.one.Prototype) bean);
			System.out.println("Current x: " + temp.x);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof com.example.one.Prototype) {
			Prototype temp = ((com.example.one.Prototype) bean);
			while (temp.x % 2 != 0) {
				temp.x = (int) (Math.random() * 10);
			}
		}
		return bean;

	}
}
