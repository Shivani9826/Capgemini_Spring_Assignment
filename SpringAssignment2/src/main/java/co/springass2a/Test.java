package co.springass2a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass2a/config.xml");
		Question Q1 = (Question) context.getBean("ques");
		System.out.println(Q1);
	}
}