package com.example.sfginterfacesegregation.with;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
public class ToyHouse implements Toy{
    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
}
