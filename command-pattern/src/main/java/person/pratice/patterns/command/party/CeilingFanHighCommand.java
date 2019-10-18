package person.pratice.patterns.command.party;
/**
 * 风扇高速旋转命令
 *
 * @author 何祥敏
 * @create 2019-10-13
 *
 */
public class CeilingFanHighCommand extends AbstractCeilingFanCommand implements Command {

	/**
	 * 有参构造器
	 * @param ceilingFan 吊扇实例
	 * @author 何祥敏
	 */
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 执行动作：向吊扇发送高速旋转指令，同时记录上一个动作。
	 * @author 何祥敏
	 */
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
}
