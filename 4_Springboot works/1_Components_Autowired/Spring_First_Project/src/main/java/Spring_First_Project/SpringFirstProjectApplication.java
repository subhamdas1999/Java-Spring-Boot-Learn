package Spring_First_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFirstProjectApplication.class, args);

		Car obj = context.getBean(Car.class);
		obj.wash();


	}

}
