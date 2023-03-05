package co.springass2b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass2b/config.xml");
		Question Q2 = (Question) context.getBean("ques");
		System.out.println(Q2);
	}
}