package co.springass1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass1/config.xml");

		Customer customer1 = context.getBean("customer", Customer.class);
		Customer customer2 = context.getBean("customer1", Customer.class);
		System.out.println(customer1);
		System.out.println(customer2);
	}

}
