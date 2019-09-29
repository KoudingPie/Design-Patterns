package person.pratice.design.patterns.strategy.algorithm;
/**
 * 不会呱呱叫的行为实现类
 *
 * @author 何祥敏
 *
 * @since 2019-09-30
 *
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
