package person.pratice.patterns.adapter;

/**
 * @description 绿头鸭
 * @author 何祥敏
 * @create 2019-10-21
 */
public class MallardDuck implements Duck{
    /**
     * 呱呱叫方法
     *
     * @author 何祥敏
     */
    @Override
    public void quack() {
        System.out.println("quack ... ...");
    }

    /**
     * 飞行
     *
     * @author 何祥敏
     */
    @Override
    public void fly() {
        System.out.println("I am flying... ...");
    }
}
