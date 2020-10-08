package chuvoibebong.decorator_pattern.condiments;

import chuvoibebong.decorator_pattern.coffees.Coffee;
import chuvoibebong.decorator_pattern.coffees.DarkRoast;

public class Whip extends Condiment {

    private Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    public static void main(String[] args) {
        Coffee myCoffee = new DarkRoast();
        myCoffee = new Whip(myCoffee);
        System.out.println(myCoffee.getDescription() + " costs " + myCoffee.getCost());
    }

    @Override
    public double getCost() {
        return coffee.getCost() + .34;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

}
