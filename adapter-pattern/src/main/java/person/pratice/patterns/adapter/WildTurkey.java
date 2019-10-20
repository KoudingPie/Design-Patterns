package person.pratice.patterns.adapter;

/**
 * @description 野生火鸡
 * @author 何祥敏
 * @create 2019-10-21
 */
public class WildTurkey implements Turkey {
    /**
     * 咯咯叫
     *
     * @author 何祥敏
     */
    @Override
    public void gobble() {
        System.out.println("Gobble, gobble ... ...");
    }

    /**
     * 飞行
     *
     * @author 何祥敏
     */
    @Override
    public void fly() {
        System.out.println("I can fly a short distance.");
    }
}
