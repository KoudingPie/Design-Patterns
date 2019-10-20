package person.pratice.patterns.adapter;

import org.junit.Test;

/**
 * @description 适配器单元测试类
 * @author 何祥敏
 * @create 2019-10-21
 */
public class TurkeyToDuckAdapterTest {

    @Test
    public void testFly(){
        Duck duck = new MallardDuck();

        System.out.println("The duck fly:");
        duck.fly();

        Turkey turkey = new WildTurkey();


        Duck adapter = new TurkeyToDuckAdapter(turkey);
        System.out.println("The adapter fly : ");
        adapter.fly();
    }

    @Test
    public void testQuack(){
        Duck duck = new MallardDuck();

        System.out.println("The duck quack:");
        duck.quack();

        Turkey turkey = new WildTurkey();


        Duck adapter = new TurkeyToDuckAdapter(turkey);
        System.out.println("The adapter quack : ");
        adapter.quack();
    }
}
