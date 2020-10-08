package chuvoibebong.decorator_pattern.coffee_producer;

import chuvoibebong.decorator_pattern.coffees.Coffee;
import chuvoibebong.decorator_pattern.coffees.DarkRoast;
import chuvoibebong.decorator_pattern.coffees.HouseBlend;

public class CoffeeFactory {
    public Coffee createCoffee(String coffee) {
        if (coffee.equals("HouseBlend")) {
            return new HouseBlend();
        } else if (coffee.equals("DarkRoast")) {
            return new DarkRoast();
        } else {
            return null;
        }
    }
}
