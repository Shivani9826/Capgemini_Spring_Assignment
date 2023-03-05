package co.springass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.springass2a.Question;

public class QuestionTest {

	@Test
	public void testList() {
		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass2a/config.xml");
		Question Q1 = (Question) context.getBean("ques");
		assertEquals("What is the capital of Madhya Pradesh?", Q1.getQuestion());
	}
}
