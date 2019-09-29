package person.pratice.design.patterns.strategy.algorithm;
/**
 * 呱呱叫行为接口
 *
 * @author 何祥敏
 * @since 2019-09-30
 *
 */
public interface QuackBehavior {
    /**
     * 呱呱叫方法，所有的实现类都要实现这个方法。
     */
    void quack();
}
