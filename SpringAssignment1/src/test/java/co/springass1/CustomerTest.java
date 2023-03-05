package co.springass1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext("co/springass1/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		assertEquals("Manav", customer.getCustomerName());
	}

}
