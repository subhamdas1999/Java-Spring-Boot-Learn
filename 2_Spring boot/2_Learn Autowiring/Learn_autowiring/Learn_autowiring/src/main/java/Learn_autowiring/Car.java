package Learn_autowiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

@Autowired
    Garage gg;


    public void Wash(){
        gg.park();
        System.out.println("I am Washing");
    }


}
