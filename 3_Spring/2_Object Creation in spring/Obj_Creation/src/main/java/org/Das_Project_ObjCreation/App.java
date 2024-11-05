package org.Das_Project_ObjCreation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        Laptop obj1 = (Laptop) context.getBean("Laptop");
        obj1.age = 45;
        System.out.println(obj1.age);


        Laptop obj2 = (Laptop) context.getBean("Laptop");
        System.out.println(obj2.age);



    }
}
