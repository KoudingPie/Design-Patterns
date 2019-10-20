package person.pratice.patterns.adapter;

/**
 * @description: 把火鸡适配成鸭子的适配器
 * @author: 何祥敏
 * @create: 2019-10-21
 */
public class TurkeyToDuckAdapter implements Duck {

    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }


    /**
     * 呱呱叫方法:实际调用了火鸡的咯咯叫方法。
     *
     * @author 何祥敏
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 飞行：实际调用了火鸡的飞行方法
     *
     * @author 何祥敏
     */
    @Override
    public void fly() {
        turkey.fly();
    }
}
