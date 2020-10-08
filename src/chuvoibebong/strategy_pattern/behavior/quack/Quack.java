package chuvoibebong.strategy_pattern.behavior.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
