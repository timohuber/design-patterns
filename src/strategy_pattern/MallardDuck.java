package strategy_pattern;

import strategy_pattern.behaviour.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}
