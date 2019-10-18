package person.pratice.patterns.command.party;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description: <code>CeilingFan</code>单元测试类
 * @author: 何祥敏
 * @create: 2019-10-13
 */
public class CeilingFanTest {

    private CeilingFan ceilingFan = new CeilingFan("Sample");

    @Test
    public void testHigh(){
        ceilingFan.high();

        Assert.assertTrue(CeilingFan.HIGH == ceilingFan.getSpeed());
    }

    @Test
    public void testMedium(){
        ceilingFan.medium();
        Assert.assertTrue(CeilingFan.MEDIUM == ceilingFan.getSpeed());
    }

    @Test
    public void testLow(){
        ceilingFan.low();
        Assert.assertTrue(CeilingFan.LOW == ceilingFan.getSpeed());
    }

    @Test
    public void testOff(){
        ceilingFan.off();
        Assert.assertTrue(CeilingFan.OFF == ceilingFan.getSpeed());
    }
}
