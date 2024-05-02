package withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Lion lion = context.getBean("lion",Lion.class);
		System.out.println(lion);

	}

}
