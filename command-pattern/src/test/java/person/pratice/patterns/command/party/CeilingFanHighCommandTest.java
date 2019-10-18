package person.pratice.patterns.command.party;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @description: <code>CeilingFanHighCommand</code>单元测试类
 * @author: 何祥敏
 * @create: 2019-10-13
 */
public class CeilingFanHighCommandTest {

    private static CeilingFan ceilingFan;

    private static Command command;

    @Before
    public void before(){
        ceilingFan = new CeilingFan("Test");
        command = new CeilingFanHighCommand(ceilingFan);
    }

    @Test
    public void testExecute(){
        command.execute();

        Assert.assertTrue(CeilingFan.HIGH == ceilingFan.getSpeed());
    }

    @Test
    public void testUndo(){
        Assert.assertTrue(CeilingFan.OFF == ceilingFan.getSpeed());
        command.execute();
        Assert.assertTrue(CeilingFan.HIGH == ceilingFan.getSpeed());
        command.undo();
        Assert.assertTrue(CeilingFan.OFF == ceilingFan.getSpeed());
    }
}
