package Learn_autowiring;


import org.springframework.stereotype.Component;

@Component
public class Garage {

    public void park(){

        System.out.println("Park my car here !!");
    }

}
