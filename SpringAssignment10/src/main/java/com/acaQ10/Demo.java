package com.acaQ10;

//ApplicationContextAware give the reference of applicationcontext so we can create another beam here;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Demo implements ApplicationContextAware {

	private ApplicationContext ap;
	Demo d2;

	public void show() {
		System.out.println(d2.toString());
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ap = applicationContext;
		d2 = (Demo) ap.getBean("d");

	}

}
