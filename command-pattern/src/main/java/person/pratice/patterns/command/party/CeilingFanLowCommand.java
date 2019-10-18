package person.pratice.patterns.command.party;

/**
 * @description: 吊扇低速旋转命令
 * @author: 何祥敏
 * @create: 2019-10-13
 */
public class CeilingFanLowCommand extends AbstractCeilingFanCommand implements Command {

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        super(ceilingFan);
    }
    /**
     * 执行动作：发送低速旋转指令。调用者通过调用这个方法发出请求，通过这个方法使得风扇执行低速旋转。
     *
     * @author 何祥敏
     */
    @Override
    public void execute() {
        this.prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
