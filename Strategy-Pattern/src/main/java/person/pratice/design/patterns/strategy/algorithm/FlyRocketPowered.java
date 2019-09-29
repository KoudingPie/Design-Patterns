package person.pratice.design.patterns.strategy.algorithm;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!!");
    }
}
