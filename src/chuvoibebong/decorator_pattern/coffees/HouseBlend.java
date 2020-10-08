package chuvoibebong.decorator_pattern.coffees;

public class HouseBlend extends Coffee {

    @Override
    public double getCost() {
        return 1.25;
    }

    @Override
    public String getDescription() {
        return "This's HouseBlend";
    }
}
