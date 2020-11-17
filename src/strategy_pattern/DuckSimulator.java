package strategy_pattern;

import strategy_pattern.behaviour.RocketPoweredFly;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehaviour(new RocketPoweredFly());
        mallard.performFly();
    }
}
