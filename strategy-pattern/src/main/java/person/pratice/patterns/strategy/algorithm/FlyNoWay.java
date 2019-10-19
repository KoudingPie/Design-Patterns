package person.pratice.patterns.strategy.algorithm;
/**
 * 不会飞行的行为实现类。
 *
 * @author 何祥敏
 * @since 2019-09-30
 *
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly!!");
    }
}
