package Learn_autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnAutowiringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnAutowiringApplication.class, args);

		Car obj = context.getBean(Car.class);

		obj.Wash();

	}

}
