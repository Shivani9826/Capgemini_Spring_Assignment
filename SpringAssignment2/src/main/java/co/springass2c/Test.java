package co.springass2c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass2c/config.xml");
		Question Q3 = (Question) context.getBean("ques");
		System.out.println(Q3);
	}
}