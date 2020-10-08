package chuvoibebong.strategy_pattern.duck;

import chuvoibebong.strategy_pattern.behavior.fly.FlyWithWings;
import chuvoibebong.strategy_pattern.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
}
