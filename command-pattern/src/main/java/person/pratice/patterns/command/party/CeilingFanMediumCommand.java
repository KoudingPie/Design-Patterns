package person.pratice.patterns.command.party;
/**
 * 吊扇中速旋转命令
 *
 * @author 何祥敏
 * @create 2019-10-13
 *
 */
public class CeilingFanMediumCommand extends AbstractCeilingFanCommand implements Command {

	/**
	 * 构造器
	 * @param ceilingFan 吊扇实例
	 * @author 何祥敏
	 */
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/**
	 * 执行动作：向吊扇发送中速旋转指令，同时记录上一个动作。
	 * @author 何祥敏
	 */
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}
}
