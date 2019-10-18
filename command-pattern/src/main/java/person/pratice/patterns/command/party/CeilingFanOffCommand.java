package person.pratice.patterns.command.party;
/**
 * 吊扇关闭命令
 *
 * @author 何祥敏
 * @create 2019-10-13
 *
 */
public class CeilingFanOffCommand extends AbstractCeilingFanCommand implements Command {
	/**
	 * 有参构造器
	 * @param ceilingFan 吊扇实例
	 * @author 何祥敏
	 */
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}
	/**
	 * 执行动作：向吊扇发送关闭指令，同时记录上一个动作。
	 * @author 何祥敏
	 */
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
}
