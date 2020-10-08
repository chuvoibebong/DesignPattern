package chuvoibebong.decorator_pattern.coffee_producer;

import chuvoibebong.decorator_pattern.coffees.Coffee;
import chuvoibebong.decorator_pattern.condiments.Whip;

public class CoffeeStore {

    Coffee coffee;
    CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public static void main(String[] args) {
        CoffeeStore myCoffeeStore = new CoffeeStore(new CoffeeFactory());
        Coffee myCoffee = myCoffeeStore.orderCoffee("HouseBlend");
        myCoffee = Whip.addWhipTo(myCoffee);
        System.out.println(myCoffee.getDescription());
        System.out.println("Total cost : " + myCoffee.getCost() + " ");
    }

    public Coffee orderCoffee(String coffee) {
        this.coffee = coffeeFactory.createCoffee(coffee);
        return this.coffee;
    }

}
