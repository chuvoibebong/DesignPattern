package chuvoibebong.decorator_pattern.condiments;

import chuvoibebong.decorator_pattern.coffees.Coffee;

public class Whip extends Condiment {

    private Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    public static Coffee addWhipTo(Coffee coffee) {
        return new Whip(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + .34;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with Whip";
    }

}
