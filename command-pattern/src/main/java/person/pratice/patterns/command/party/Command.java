package person.pratice.patterns.command.party;
/**
 * 命令对象接口，定义了两个方法：execute和undo用来执行命令和撤销命令。
 *
 * @author 何祥敏
 * @create 2019-10-13
 *
 */
public interface Command {
	/**
	 * 执行动作：发送具体指令。调用者通过调用这个方法发出请求，通过这个方法使得接收者的动作被调用。
	 * @author 何祥敏
	 */
	public void execute();
	/**
	 * 撤销动作：根据历史记录的上一个动作，向接收者发送上一个执行的动作指令，实现了动作的撤销。
	 * @author 何祥敏
	 */
	public void undo();
}
