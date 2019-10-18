package person.pratice.patterns.command.party;

/**
 * 风扇指令抽象类，提供一些公用的方法实现，可以通过继承此类实现方法的复用。如果您的类几乎不会复用这里的方法，那就不要继承这里了。
 * @author 何祥敏
 * @create 2019-10-13
 */
public abstract class AbstractCeilingFanCommand implements Command{
    /**
     * 吊扇实例
     */
    protected CeilingFan ceilingFan;
    /**
     * 记录上一个速度，可以用来实现动作的撤销
     */
    protected int prevSpeed;

    /**
     * 有参构造器
     * @param ceilingFan 吊扇实例
     * @author 何祥敏
     */
    public AbstractCeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    /**
     * 撤销动作：根据记录的风扇上一个动作，执行上一个指令。
     * @author 何祥敏
     */
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH: 	ceilingFan.high(); break;
            case CeilingFan.MEDIUM: ceilingFan.medium(); break;
            case CeilingFan.LOW: 	ceilingFan.low(); break;
            default: 				ceilingFan.off(); break;
        }
    }
}
