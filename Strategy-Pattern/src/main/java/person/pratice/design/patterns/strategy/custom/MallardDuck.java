package person.pratice.design.patterns.strategy.custom;

import person.pratice.design.patterns.strategy.algorithm.FlyWithWings;
import person.pratice.design.patterns.strategy.algorithm.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck!!");
    }
}
