package com.example.sfginterfacesegregation.without;

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
    @Override
    public void move(){}
    @Override
    public void fly(){}
}

/*
* As you can see in the code, ToyHouse needs to provide implementation of the move() and fly() methods, even though it does not require them.
* This is a violation of the Interface Segregation Principle. Such violations affect code readability and confuse programmers.
* Imagine that you are writing the ToyHouse class and the intellisense feature of your IDE pops up the fly() method for auto complete.
* Not exactly the behavior you want for a toy house, is it?

Violation of the Interface Segregation Principle also leads to violation of the complementary Open Closed Principle.
* As an example, consider that the Toy interface is modified to include a walk( ) method to accommodate toy robots.
* As a result, you now need to modify all existing Toy implementation classes to include a walk method even if the toys don’t walk.
* In fact, the Toy implementation classes will never be closed for modifications, which will lead to a fragile application that is difficult and expensive to maintain.
* */
