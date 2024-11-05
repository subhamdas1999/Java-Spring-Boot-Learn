package org.Das_Project_SetterInjection;

public class Laptop {

    private Desktop dis;
    private int price;

    public Laptop(){
        System.out.println("Object Created");
    }

    public void getPrice(){
        System.out.println("Price is "+price);
    }

    public void setPrice(int price){
        this.price = price;
    }

    public Desktop getDis() {
        return dis;
    }

    public void setDis(Desktop dis) {
        this.dis = dis;
    }

    public void show(){
        dis.display();
    }



}
