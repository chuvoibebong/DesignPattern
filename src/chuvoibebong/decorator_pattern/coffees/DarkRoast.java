package chuvoibebong.decorator_pattern.coffees;

public class DarkRoast extends Coffee {

    @Override
    public double getCost() {
        return .89;
    }

    @Override
    public String getDescription() {
        return "This is DarkRoast";
    }
}
