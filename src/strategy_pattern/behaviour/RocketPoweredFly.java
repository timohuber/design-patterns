package strategy_pattern.behaviour;

public class RocketPoweredFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}