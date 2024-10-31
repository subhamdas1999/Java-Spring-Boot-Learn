package Spring_First_Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {


@Autowired
    Bike obj_bk;

    public void wash(){

        obj_bk.speed();
        System.out.println("Wash my car !! ");

    }
}
