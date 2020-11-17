package strategy_pattern;

import strategy_pattern.behaviour.FlyBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    public Duck() {
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void swim() {
        System.out.println("All ducks swim.");
    }
}
