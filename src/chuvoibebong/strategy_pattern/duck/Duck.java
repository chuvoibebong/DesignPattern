package chuvoibebong.strategy_pattern.duck;

import chuvoibebong.strategy_pattern.behavior.fly.FlyBehavior;
import chuvoibebong.strategy_pattern.behavior.quack.QuackBehavior;
import chuvoibebong.strategy_pattern.behavior.swim.SwimBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}
