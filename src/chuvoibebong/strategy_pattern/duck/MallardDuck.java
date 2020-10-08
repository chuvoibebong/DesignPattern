package chuvoibebong.strategy_pattern.duck;

import chuvoibebong.strategy_pattern.behavior.fly.FlyWithWings;
import chuvoibebong.strategy_pattern.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


}
