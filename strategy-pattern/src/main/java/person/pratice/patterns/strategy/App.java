package person.pratice.patterns.strategy;

import person.pratice.patterns.strategy.algorithm.FlyRocketPowered;
import person.pratice.patterns.strategy.custom.Duck;
import person.pratice.patterns.strategy.custom.ModelDuck;

/**
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();;
    }
}
