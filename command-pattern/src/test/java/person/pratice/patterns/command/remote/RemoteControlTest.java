package person.pratice.patterns.command.remote;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import person.pratice.patterns.command.party.*;

/**
 * @description: <code>RemoteControl</code>单元测试类
 * @author: 何祥敏
 * @create: 2019-10-13
 */
public class RemoteControlTest {

    private CeilingFan ceilingFan;

    private RemoteControl remoteControl;

    @Before
    public void before(){
        ceilingFan = new CeilingFan("Test");

        Command offCommand = new CeilingFanOffCommand(ceilingFan);
        Command lowCommand = new CeilingFanLowCommand(ceilingFan);
        Command mediumCommand = new CeilingFanMediumCommand(ceilingFan);
        Command highCommand = new CeilingFanHighCommand(ceilingFan);

        remoteControl = new RemoteControl();
        remoteControl.setCommand(0, offCommand);
        remoteControl.setCommand(1,lowCommand);
        remoteControl.setCommand(2,mediumCommand);
        remoteControl.setCommand(3,highCommand);
    }

    @Test
    public void testPressed(){
        remoteControl.inButtonPressed(2);

        Assert.assertTrue(CeilingFan.MEDIUM == ceilingFan.getSpeed());
    }
}
