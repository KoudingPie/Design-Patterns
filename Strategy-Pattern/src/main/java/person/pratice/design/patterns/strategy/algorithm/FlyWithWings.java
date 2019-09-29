package person.pratice.design.patterns.strategy.algorithm;
/**
 * 有翅膀的飞行行为实现类。
 *
 * @author 何祥敏
 * @since 2019-09-30
 *
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
    System.out.println("I am flying!!");
    }
}
