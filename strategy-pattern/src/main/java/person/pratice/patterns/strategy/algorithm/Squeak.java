package person.pratice.patterns.strategy.algorithm;
/**
 * 吱吱叫的行为实现类
 *
 * @author 何祥敏
 * @since 2019-09-30
 *
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
