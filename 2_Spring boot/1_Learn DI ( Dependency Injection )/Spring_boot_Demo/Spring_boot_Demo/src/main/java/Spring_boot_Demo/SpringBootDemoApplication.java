package Spring_boot_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);

		Car obj = context.getBean(Car.class);
		obj.wash();

	}



}
